package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SettlementDao {

    MariaDbDataSource dataSource;

    public SettlementDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String findSettlementByPostalCode(int postalCode) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select settlement from settlement where postal_code = ?");
        ) {
            stmt.setInt(1, postalCode);

            return getString(stmt);

        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }

    private String getString(PreparedStatement stmt) {
        try (
                ResultSet rs = stmt.executeQuery();
        ) {
            if (rs.next()) {
                String stringSettlement = rs.getString("settlement");
                return stringSettlement;
            }
            throw new IllegalArgumentException("No result");
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }
}
