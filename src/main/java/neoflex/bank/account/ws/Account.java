package neoflex.bank.account.ws;

import neoflex.bank.account.dao.AccountCreate;
import neoflex.bank.account.dao.AccountDelete;
import neoflex.bank.account.dao.AccountRead;
import neoflex.bank.account.dao.AccountUpdate;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Account {


    public Account() {
    }

    AccountCreate accountCreate = new AccountCreate();
    AccountRead accountRead = new AccountRead();
    AccountDelete accountDelete = new AccountDelete();
    AccountUpdate accountUpdate = new AccountUpdate();
    neoflex.bank.account.model.Account account = new neoflex.bank.account.model.Account();


   @WebMethod
    public String create(int client_id, int balance, String open_date, String close_date, String status) {
        accountCreate.create(client_id, balance, open_date, close_date, status);
        return "Account created";
    }


    @WebMethod
    public neoflex.bank.account.model.Account read(int id) {
        accountRead.read(id);
        return account;
    }

    @WebMethod
    public String update(int id, int client_id, int balance, String open_date, String close_date, String status) {
        accountUpdate.update(id, client_id, balance, open_date, close_date, status);
        return "Account updated";
    }


    @WebMethod
    public String delete(int id) {
        accountDelete.delete(id);
        return "Account deleted";
    }
}