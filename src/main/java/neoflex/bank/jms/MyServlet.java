package neoflex.bank.jms;

import javax.annotation.Resource;
import javax.jms.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {

    @Resource(name = "foo")
    private Topic fooTopic;

    @Resource(name = "barQueue")
    private Queue barQueue;

    @Resource
    private ConnectionFactory connectionFactory;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //...

        Connection connection = null;
        try {
            connection = connectionFactory.createConnection();
            connection.start();

            // Create a Session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // Create a MessageProducer from the Session to the Topic or Queue
            MessageProducer producer = session.createProducer(barQueue);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            // Create a message
            TextMessage message = session.createTextMessage("Hello World!");

            // Tell the producer to send the message
            producer.send(message);

            //...
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}