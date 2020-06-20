package com.vural.dp.behavioral.chainofresponsibility.sample01.client;

import com.vural.dp.behavioral.chainofresponsibility.sample01.handlers.AbstractSupportHandler;
import org.junit.Test;

public class RequestorClientTest {

    @Test
    public void testGetHandlerChain() {
        AbstractSupportHandler handler = RequestorClient.getHandlerChain();
        handler.receiveRequest(AbstractSupportHandler.TECHNICAL, "I'm having problem with my internet connectivity.");
        System.out.println("...........................................");
        handler.receiveRequest(AbstractSupportHandler.BILLING, "Please resend my bill of this month.");
        System.out.println("...........................................");
        handler.receiveRequest(AbstractSupportHandler.GENERAL, "Please send any other plans for home users");
        System.out.println("...........................................");
    }

}