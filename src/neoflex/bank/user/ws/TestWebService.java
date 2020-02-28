package neoflex.bank.user.ws;

import neoflex.bank.user.daoUser.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface TestWebService {
    @WebMethod

   public String create(String name, int age, String email);

    public User findById (int id);//на звать find by id   - return user

    public String update(int id,String name, int age, String email);

    public void delete (int id);








}

