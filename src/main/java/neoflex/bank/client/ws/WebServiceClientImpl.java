package neoflex.bank.client.ws;

import neoflex.bank.client.dao.*;
import neoflex.bank.client.model.Client;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService( )
public class WebServiceClientImpl implements WebServiceClient {
    ClientCreate clientCreate = new ClientCreate();
    ClientRead clientRead = new ClientRead();
    ClientDelete clientDelete = new ClientDelete();
    ClientUpdate clientUpdate = new ClientUpdate();
    Client user = new Client();

    public String create(String username, int password, String birth_date, String name, String surname) {
        clientCreate.create(username, password, birth_date, name, surname);
        return "Client created ";
    }

    @Override
    public Client read(int id) {
        clientRead.read(id);
        return user;
    }

    @Override
    public String update(int id, String username, int password, String birth_date, String name, String surname) {
        clientUpdate.update(id, username, password, birth_date, name, surname);
        return "Client updated ";
    }

    @Override
    public String delete(int id) {
        clientDelete.delete(id);
        return "Client deleted ";
    }

}

