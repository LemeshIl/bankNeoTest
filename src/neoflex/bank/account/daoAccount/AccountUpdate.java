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
            //statement.executeUpdate("UPDATE mydbtest.users SET name='" + name + "',age='" + age + "',email='" + email + "'  WHERE id=" + id);
            statement.executeUpdate("UPDATE mydbtest.account SET userid='" + userid + "',balance='" + balance + "' WHERE id=" + id);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}
