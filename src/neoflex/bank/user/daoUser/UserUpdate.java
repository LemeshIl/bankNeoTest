package neoflex.bank.user.daoUser;


import java.sql.*;

public class UserUpdate {

    public  void update(int id, String name, int age, String email) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mydbtest?useUnicode=" +
                        "true&useJDBCCompliantTimezoneShift=" +
                        "true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "mysql")) {
            Statement statement = conn.createStatement();
            statement.executeUpdate("update mydbtest.users set name=\"Vasily\"  set;");

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}
