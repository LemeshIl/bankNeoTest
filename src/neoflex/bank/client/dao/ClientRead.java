package neoflex.bank.client.dao;


import neoflex.bank.client.model.Client;

import java.sql.*;

public class ClientRead {

    public void read(int id) {
        String query = "SELECT* FROM client WHERE id= " + id;

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mydbtest?useUnicode=" +
                        "true&useJDBCCompliantTimezoneShift=" +
                        "true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "mysql")) {
            try (Statement statement = conn.createStatement()) {

                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    Client client = new Client();
                    client.setId(resultSet.getInt(1));
                    client.setUsername(resultSet.getString(2));
                    client.setPassword(resultSet.getInt(3));
                    client.setBirth_date(resultSet.getString(4));
                    client.setName(resultSet.getString(5));
                    client.setSurname(resultSet.getString(6));
                    System.out.println(client);
                }
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

