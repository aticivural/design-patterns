package com.vural.dp.behavioral.interpreter.sample01;

import java.util.Stack;

public class ExpressionParser {

    Stack<Expression> stack = new Stack();

    public int parse(String str) {
        String[] tokenList = str.split(" ");
        for (String symbol : tokenList) {
            if (!ParseUtil.isOperator(symbol)) {
                NumberExpression numberExpression = new NumberExpression(symbol);
                stack.push(numberExpression);
                System.out.printf("Pushed to stack: %d\n", numberExpression.interpret());
            } else if (ParseUtil.isOperator(symbol)) {
                Expression firstExpression = stack.pop();
                Expression secondExpression = stack.pop();

                System.out.printf("Popped operands %d and %d\n", firstExpression.interpret(), secondExpression.interpret());

                Expression operator = ParseUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.printf("Applying Operator: %s\n", operator);
                int result = operator.interpret();
                NumberExpression resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
                System.out.printf("Pushed result to stack: %d \n", resultExpression.interpret());

            }
        }

        return stack.pop().interpret();
    }

}
