package com.vural.dp.structural.bridge.sample01.abstraction;

import com.vural.dp.structural.bridge.sample01.implementation.EmailMessageSender;
import com.vural.dp.structural.bridge.sample01.implementation.MessageSender;
import com.vural.dp.structural.bridge.sample01.implementation.TextMessageSender;
import org.junit.Test;

public class MessageTest {

    @Test
    public void testSend() {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();
    }

}