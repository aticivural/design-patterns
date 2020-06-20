package com.vural.dp.behavioral.chainofresponsibility.sample01.handlers;

public class TechnicalSupportHandler extends AbstractSupportHandler {

    public TechnicalSupportHandler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println(getClass().getSimpleName() + ": Processing request " + message);
    }
}
