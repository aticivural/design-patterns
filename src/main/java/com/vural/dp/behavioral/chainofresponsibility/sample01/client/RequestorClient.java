package com.vural.dp.behavioral.chainofresponsibility.sample01.client;

import com.vural.dp.behavioral.chainofresponsibility.sample01.handlers.AbstractSupportHandler;
import com.vural.dp.behavioral.chainofresponsibility.sample01.handlers.BillingSupportHandler;
import com.vural.dp.behavioral.chainofresponsibility.sample01.handlers.GeneralSupportHandler;
import com.vural.dp.behavioral.chainofresponsibility.sample01.handlers.TechnicalSupportHandler;

public class RequestorClient {

    public static AbstractSupportHandler getHandlerChain() {
        AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler(AbstractSupportHandler.TECHNICAL);
        AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(AbstractSupportHandler.BILLING);
        AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL);

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);

        return technicalSupportHandler;

    }
}
