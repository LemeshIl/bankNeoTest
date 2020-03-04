package neoflex.bank.client.dao;


import neoflex.bank.jms.Audit;
import neoflex.bank.jms.SendMessage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientCreate {
    SendMessage sendMessage = new SendMessage();

    public void create(String username, int password, String birth_date, String name, String surname) {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mydbtest?useUnicode=" +
                        "true&useJDBCCompliantTimezoneShift=" +
                        "true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "mysql")) {
            Statement statement = conn.createStatement();

            statement.executeUpdate("insert into client (username, password, birth_date,name, surname) " +
                    "values ('" + username + "', " + password + ",'" + birth_date + "','" + name + "','" + surname + "');");
            Audit audit = new Audit();

//audit.createClient();
            sendMessage.send("Создан клиент с именем"+username);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}

