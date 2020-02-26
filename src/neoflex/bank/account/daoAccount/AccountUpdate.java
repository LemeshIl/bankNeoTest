package neoflex.bank.account.daoAccount;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountUpdate {

    public  void update(int id, int userid, int balance) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mydbtest?useUnicode=" +
                        "true&useJDBCCompliantTimezoneShift=" +
                        "true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "mysql")) {
            Statement statement = conn.createStatement();
            statement.executeUpdate("update mydbtest.account set id=id, set userid=userid, set balance=balance, WHERE ID=id;");

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}
