package neoflex.bank.account.ws;

import neoflex.bank.account.dao.*;
import neoflex.bank.account.model.Account;

import javax.jws.WebService;

@WebService(endpointInterface = "neoflex.bank.account.ws.WebServiceAccount")
public class WebServiceAccountImpl implements WebServiceAccount {
    AccountCreate accountCreate = new AccountCreate();
    AccountRead accountRead = new AccountRead();
    AccountDelete accountDelete = new AccountDelete();
    AccountUpdate accountUpdate = new AccountUpdate();
    Account account = new Account();


    @Override
    public String create(int client_id, int balance, String open_date, String close_date, String status) {
        accountCreate.create(client_id, balance, open_date, close_date, status);
        return "Account created";
    }


    @Override
    public Account read(int id) {
        accountRead.read(id);
        return account;
    }

    @Override
    public String update(int id, int client_id, int balance, String open_date, String close_date, String status) {
        accountUpdate.update(id, client_id, balance, open_date, close_date, status);
        return "Account updated";
    }


    @Override
    public String delete(int id) {
        accountDelete.delete(id);
        return "Account deleted";
    }

}

