package neoflex.bank.user.ws;

import neoflex.bank.user.daoUser.User;
import neoflex.bank.user.daoUser.UserCreate;
import neoflex.bank.user.daoUser.UserDelete;
import neoflex.bank.user.daoUser.UserRead;
import neoflex.bank.user.ws.TestWebService;

import javax.jws.WebService;

@WebService(endpointInterface = "neoflex.bank.user.ws.TestWebService")
public class TestWebServiceImpl implements TestWebService {
    UserCreate userCreate = new UserCreate();
    UserRead userRead = new UserRead();
    UserDelete userDelete=new UserDelete();
    User user=new User();

    public String create( String name, int age, String email) {
      userCreate.create( name, age, email);

      return "User created ";
    }


    @Override
    public User findById(int id) {
        userRead.read(id);
        return user;
    }

    @Override
    public void update(int id,String name, int age, String email){

    }

    @Override
    public void delete (int id){
userDelete.delete(id);
    }

}

