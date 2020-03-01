package neoflex.bank.account.ws;

import neoflex.bank.account.model.Account;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface WebServiceAccount {
    @WebMethod


   public String create(int client_id, int balance, String open_date, String close_date, String status);

    public Account read(int id);

    public String update(int id, int client_id, int balance, String open_date, String close_date, String status);

    public String delete(int id);






}

