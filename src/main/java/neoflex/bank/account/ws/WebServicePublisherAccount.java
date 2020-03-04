package neoflex.bank.account.ws;


import javax.xml.ws.Endpoint;

public class WebServicePublisherAccount {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/wss/account", new WebServiceAccountImpl());
    }
}
