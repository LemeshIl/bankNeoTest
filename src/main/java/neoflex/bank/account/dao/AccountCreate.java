package neoflex.bank.account.dao;



import neoflex.bank.jms.SendMessage;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
@Stateless
public class AccountCreate {

    private DataSource ds;

    public AccountCreate(){

        try {
            Context ctx = new InitialContext();
            ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mydbtest");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
    public void create(int client_id, int balance, String open_date, String close_date, String status) {
        SendMessage sendMessage = new SendMessage();
        try (Connection conn = ds.getConnection()) {
            Statement statement = conn.createStatement();

            statement.executeUpdate("insert into account (client_id, balance, open_date, close_date,status) " +
                    "values ('" + client_id + "','" + balance + "','" + open_date + "','" + close_date + "','" + status + "' );");
            sendMessage.send("Создан аккфунт с именем"+client_id);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}
