package neoflex.bank.account.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountUpdate {

    public void update(int id, int client_id, int balance, String open_date, String close_date, String status) {
        String query = "UPDATE account  SET  client_id='" + client_id + "', balance='" + balance + "', open_date ='" + open_date + "', close_date ='" + close_date + "', status ='" + status + "' WHERE id=" + id;

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mydbtest?useUnicode=" +
                        "true&useJDBCCompliantTimezoneShift=" +
                        "true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "mysql")) {
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}
