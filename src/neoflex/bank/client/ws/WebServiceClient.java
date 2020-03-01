package neoflex.bank.client.ws;

import neoflex.bank.client.model.Client;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface WebServiceClient {
    @WebMethod

   public String create(String username, int password, String birth_date,String name, String surname);

    public Client read (int id);

    public String update(int id,String username, int password, String birth_date,String name, String surname);

    public String delete (int id);









}

