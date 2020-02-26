package neoflex.bank.user.ws;

import neoflex.bank.user.ws.TestWebServiceImpl;

import javax.xml.ws.Endpoint;

public class TestWebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/wss/user", new TestWebServiceImpl());
    }
}
