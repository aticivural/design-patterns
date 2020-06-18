package com.vural.dp.structural.bridge.sample01.abstraction;

import com.vural.dp.structural.bridge.sample01.implementation.MessageSender;

public abstract class Message {

    MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send();
}
