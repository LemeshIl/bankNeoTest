package neoflex.bank.user.daoUser;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserCreate {

    public void create(String name, int age, String email) {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mydbtest?useUnicode=" +
                        "true&useJDBCCompliantTimezoneShift=" +
                        "true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "mysql")) {
            Statement statement = conn.createStatement();

            statement.executeUpdate("insert into users (name, age, email) values ('" + name + "', " + age + ",'" + email + "');");
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}

