package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CitizenDao {

    MariaDbDataSource dataSource;


    public CitizenDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("create table if not exists citizens" +
                                "( pk int not null auto_increment," +
                                " name varchar (255), postal_code int," +
                                " age int, email varchar (255)," +
                                " ssn varchar (255)," +
                                " primary key (pk))")) {
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot create", se);
        }
    }

    public void insertCitizen(Citizen citizens) {
        try (
                Connection conn = dataSource.getConnection()
        ) {
            conn.setAutoCommit(false);
            extracted(conn, citizens);
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }

    private void extracted(Connection conn, Citizen citizen) throws SQLException {
        try (PreparedStatement stmt =
                     conn.prepareStatement("insert into citizens (`name`, `postal_code`, `age`, `email`, `ssn`) values (?,?,?,?,?)")) {

                stmt.setString(1, citizen.getName());
                stmt.setInt(2, citizen.getPostalCode());
                stmt.setInt(3, citizen.getAge());
                stmt.setString(4, citizen.getEmail());
                stmt.setString(5, citizen.getSsn());
                stmt.executeUpdate();

            conn.commit();
        }
        catch (IllegalArgumentException ex) {
            conn.rollback();
        }
    }

    public void insertCitizens(List<Citizen> citizens) {
        for(Citizen c: citizens) {
            try (
                    Connection conn = dataSource.getConnection()
            ) {
                conn.setAutoCommit(false);
                extracted(conn, c);
            }
            catch (SQLException se) {
                throw new IllegalStateException("Cannot insert", se);
            }
        }

    }

    public List<Citizen> findCitizens() {

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select * from citizens")
                ) {
            return getCitizens(stmt);

        } catch (SQLException se) {
            throw new IllegalArgumentException("This file not found", se);
        }

    }


    private List<Citizen> getCitizens(PreparedStatement stmt) throws SQLException {
        List<Citizen> citizens = new ArrayList<>();
        try (
                ResultSet rs = stmt.executeQuery();
                 ) {

                    while (rs.next()) {
                        int pk = rs.getInt("pk");
                        String name = rs.getString("name");
                        int postalCode = rs.getInt("postal_code");
                        int age = rs.getInt("age");
                        String email = rs.getString("email");
                        String ssn = rs.getString("ssn");
                        citizens.add(new Citizen(pk, name, postalCode, age, email, ssn));
                    }
                    return citizens;
                }
        catch (SQLException se) {
            throw new IllegalArgumentException("Error by insert", se);
        }
    }

}
