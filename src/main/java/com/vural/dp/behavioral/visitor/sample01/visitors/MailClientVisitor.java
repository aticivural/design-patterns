package com.vural.dp.behavioral.visitor.sample01.visitors;

import com.vural.dp.behavioral.visitor.sample01.structure.OperaMailClient;
import com.vural.dp.behavioral.visitor.sample01.structure.SquirrelMailClient;
import com.vural.dp.behavioral.visitor.sample01.structure.ZimbraMailClient;

public interface MailClientVisitor {
    void visit(OperaMailClient mailClient);

    void visit(SquirrelMailClient mailClient);

    void visit(ZimbraMailClient mailClient);
}
