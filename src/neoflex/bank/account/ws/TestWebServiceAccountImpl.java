package neoflex.bank.account.ws;

import neoflex.bank.account.daoAccount.*;

import javax.jws.WebService;

@WebService(endpointInterface = "neoflex.bank.account.ws.TestWebServiceAccount")
public class TestWebServiceAccountImpl implements TestWebServiceAccount {
    AccountCreate accountCreate = new AccountCreate();
    AccountRead accountRead = new AccountRead();
    AccountDelete accountDelete = new AccountDelete();
    AccountUpdate accountUpdate = new AccountUpdate();
    Account account = new Account();


    @Override
    public String create(int userid, int balance) {
        accountCreate.create(userid, balance);
        return "Account create";
    }


    @Override
    public Account findById(int id) {
        accountRead.read(id);
        return account;
    }

    @Override
    public String update(int id, int userid, int balance) {
        accountUpdate.update(id, userid, balance);
        return "user update";
    }

    @Override
    public void delete(int id) {
        accountDelete.delete(id);
    }

}

