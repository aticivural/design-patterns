package com.vural.dp.structural.bridge.sample01.implementation;

public class TextMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("TextMessageSender: Sending text messageç...");
    }
}
