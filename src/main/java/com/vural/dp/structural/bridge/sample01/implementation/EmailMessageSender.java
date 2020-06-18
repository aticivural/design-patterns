package com.vural.dp.structural.bridge.sample01.implementation;

public class EmailMessageSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("EmailMessageSender: Sending email message");
    }
}
