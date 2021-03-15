package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class VaccinationsDao {

    MariaDbDataSource dataSource;
    CitizenDao citizenDao;

    public VaccinationsDao(MariaDbDataSource dataSource, CitizenDao citizenDao) {
        this.dataSource = dataSource;
        this.citizenDao = citizenDao;
    }

    public void deleteVaccinations(Vaccinations vaccinations) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("delete from vaccinations where citizen_id = ?")
                ) {
            stmt.setInt(1, vaccinations.getCitizen_id());
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalArgumentException("No such id", se);
        }
    }


    public void updateVaccinations(int id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("update vaccinations set status = 'yes' where citizen_id = ?")
                ) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalArgumentException("No such citizen_id", se);
        }
    }


    public void insertVaccinations(Vaccinations vaccination) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into vaccinations (`citizen_id`, `vaccination_date`, `status`, `note`, `vaccination_type`) values (?,?,?,?,?)")
        ) {
            stmt.setInt(1, vaccination.getCitizen_id());
            stmt.setDate(2, java.sql.Date.valueOf(vaccination.getVaccination_date().toString()));
            stmt.setString(3, vaccination.getStatus());
            stmt.setString(4, vaccination.getNote());
            stmt.setString(5, vaccination.getVaccination_type());
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }




    public List<Vaccinations> findVaccinations() {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select * from vaccinations");
        ) {
            return getVaccinationsList(stmt);

        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }


    private List<Vaccinations> getVaccinationsList(PreparedStatement stmt) {
        List<Vaccinations> vaccinations = new ArrayList<>();
        try (
                ResultSet rs = stmt.executeQuery();
        ) {

            while (rs.next()) {
                int id = rs.getInt("pk");
                int citizen_id = rs.getInt("citizen_id");
                Date vaccination_date = rs.getDate("vaccination_date");
                String status = rs.getString("status");
                String note = rs.getString("note");
                String vaccination_type = rs.getString("vaccination_type");

                vaccinations.add(new Vaccinations(id, citizen_id, vaccination_date, status, note, vaccination_type));
            }
            return vaccinations;

        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }


}
