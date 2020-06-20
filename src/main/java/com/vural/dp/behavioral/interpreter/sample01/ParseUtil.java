package com.vural.dp.behavioral.interpreter.sample01;

public class ParseUtil {

    public static boolean isOperator(String symbol) {
        return "+".equals(symbol) || "-".equals(symbol) || "*".equals(symbol);
    }

    public static Expression getExpressionObject(Expression firstExpression,
                                                 Expression secondExpression,
                                                 String symbol) {
        if ("+".equals(symbol)) {
            return new AdditionExpression(firstExpression, secondExpression);
        } else if ("-".equals(symbol)) {
            return new SubtractionExpression(firstExpression, secondExpression);
        } else {
            return new MultiplicationExpression(firstExpression, secondExpression);
        }

    }
}
