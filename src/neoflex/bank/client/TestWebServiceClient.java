package neoflex.bank.client;

import neoflex.bank.user.ws.TestWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class TestWebServiceClient {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/wss/test");
        QName qname = new QName("http://ws.project/", "TestWebServiceImplService");
        Service service = Service.create(url, qname);
        TestWebService testWebService = service.getPort(TestWebService.class);


    }
}
