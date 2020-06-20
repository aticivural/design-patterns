package com.vural.dp.behavioral.chainofresponsibility.sample01.handlers;

public abstract class AbstractSupportHandler {

    public static final int TECHNICAL = 10;
    public static final int BILLING = 20;
    public static final int GENERAL = 30;

    protected int level;

    protected AbstractSupportHandler nextHandler;

    public void setNextHandler(AbstractSupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void receiveRequest(int level, String message) {
        if (this.level <= level) {
            handleRequest(message);
        }
        if (nextHandler != null) {
            nextHandler.receiveRequest(level, message);
        }
    }

    protected abstract void handleRequest(String message);
}
