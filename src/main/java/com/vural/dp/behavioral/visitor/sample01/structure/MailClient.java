package com.vural.dp.behavioral.visitor.sample01.structure;

import com.vural.dp.behavioral.visitor.sample01.visitors.MailClientVisitor;

public interface MailClient {
    void sendMail(String[] mailInfo);

    void receiveMail(String[] mailInfo);

    boolean accept(MailClientVisitor visitor);
}