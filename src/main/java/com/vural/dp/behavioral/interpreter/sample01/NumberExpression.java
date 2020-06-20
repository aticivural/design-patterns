package com.vural.dp.behavioral.interpreter.sample01;

public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Integer.valueOf(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
