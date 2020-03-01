package neoflex.bank.client.ws;

import javax.xml.ws.Endpoint;

public class WebServicePublisherClient {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/wss/client", new WebServiceClientImpl());
    }
}
