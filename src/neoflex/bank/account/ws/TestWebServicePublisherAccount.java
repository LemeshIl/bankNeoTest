package neoflex.bank.account.ws;

import neoflex.bank.account.ws.TestWebServiceAccountImpl;


import javax.xml.ws.Endpoint;

public class TestWebServicePublisherAccount {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/wss/account", new TestWebServiceAccountImpl());
    }
}
