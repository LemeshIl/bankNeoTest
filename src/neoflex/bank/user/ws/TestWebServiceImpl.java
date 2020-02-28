package neoflex.bank.user.ws;

import neoflex.bank.user.daoUser.*;
import neoflex.bank.user.ws.TestWebService;

import javax.jws.WebService;

@WebService(endpointInterface = "neoflex.bank.user.ws.TestWebService")
public class TestWebServiceImpl implements TestWebService {
    UserCreate userCreate = new UserCreate();
    UserRead userRead = new UserRead();
    UserDelete userDelete=new UserDelete();
    UserUpdate userUpdate=new UserUpdate();
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
    public String update(int id,String name, int age, String email){
        userUpdate.update(id, name, age, email);
        return "User update ";
    }

    @Override
    public void delete (int id){
userDelete.delete(id);
    }

}

