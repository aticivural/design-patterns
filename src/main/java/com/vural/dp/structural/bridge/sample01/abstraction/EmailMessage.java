package com.vural.dp.structural.bridge.sample01.abstraction;

import com.vural.dp.structural.bridge.sample01.implementation.MessageSender;

public class EmailMessage extends Message {

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
