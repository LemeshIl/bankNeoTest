package neoflex.bank.account.ws;

import neoflex.bank.account.daoAccount.Account;
import neoflex.bank.account.daoAccount.AccountCreate;
import neoflex.bank.account.daoAccount.AccountDelete;
import neoflex.bank.account.daoAccount.AccountRead;

import javax.jws.WebService;

@WebService(endpointInterface = "neoflex.bank.account.ws.TestWebServiceAccount")
public class TestWebServiceAccountImpl implements TestWebServiceAccount {
    AccountCreate accountCreate = new AccountCreate();
    AccountRead accountRead = new AccountRead();
    AccountDelete accountDelete = new AccountDelete();
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
    public void update(int id, int userid, int balance) {

    }

    @Override
    public void delete(int id) {
        accountDelete.delete(id);
    }

}

