package neoflex.bank.client.dao;


import java.sql.*;

public class ClientUpdate {

    public void update(int id, String username, int password, String birth_date, String name, String surname) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mydbtest?useUnicode=" +
                        "true&useJDBCCompliantTimezoneShift=" +
                        "true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "mysql")) {
            Statement statement = conn.createStatement();

            statement.executeUpdate("UPDATE client SET username='" + username + "',password='" + password + "'," +
                    "birth_date='" + birth_date + "',name ='" + name + "', surname='" + surname + "' WHERE id=" + id);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}
