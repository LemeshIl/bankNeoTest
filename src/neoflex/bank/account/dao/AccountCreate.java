package neoflex.bank.account.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountCreate {

    public void create(int client_id, int balance, String open_date, String close_date, String status) {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mydbtest?useUnicode=" +
                        "true&useJDBCCompliantTimezoneShift=" +
                        "true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "mysql")) {
            Statement statement = conn.createStatement();

            statement.executeUpdate("insert into account (client_id, balance, open_date, close_date,status) " +
                    "values ('" + client_id + "','" + balance + "','" + open_date + "','" + close_date + "','" + status + "' );");
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}

