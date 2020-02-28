package neoflex.bank.account.ws;

import neoflex.bank.account.daoAccount.Account;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface TestWebServiceAccount {
    @WebMethod


   public String create(int userid, int balance);

    public Account findById(int id);

    public String update(int id,int userid, int balance);

    public void delete(int id);






}

