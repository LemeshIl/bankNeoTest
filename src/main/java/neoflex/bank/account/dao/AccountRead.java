package neoflex.bank.account.dao;


import neoflex.bank.account.model.Account;

import java.sql.*;

public class AccountRead {

    public void read (int id) {
        String query = "SELECT* FROM account WHERE id= "+id;

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/mydbtest?useUnicode=" +
                        "true&useJDBCCompliantTimezoneShift=" +
                        "true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "mysql")) {
            try (Statement statement = conn.createStatement()) {

                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    Account account = new Account();
                    account.setId(resultSet.getInt(1));
                    account.setClient_id(resultSet.getInt(2));
                    account.setBalance(resultSet.getInt(3));
                    account.setOpen_date(resultSet.getString(4));
                    account.setClose_date(resultSet.getString(5));
                    account.setStatus(resultSet.getString(6));
                    System.out.println(account);
                }
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

