package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    Calculator(String mathExpression) {
        String[] mathExpressionArray = mathExpression.split(" ");
        a = Integer.parseInt(mathExpressionArray[0]);
        sign = mathExpressionArray[1].charAt(0);
        b = Integer.parseInt(mathExpressionArray[2]);
    }

    double calculate() {
        switch(sign) {
            case '+' :
                return (double) a + b;
            case '-' :
                return (double) a - b;
            case '*' :
                return (double) a * b;
            case '/' :
                if(b == 0) {
                    System.out.println("You can't devide by zero!");
                    return Double.MIN_VALUE;
                } else {
                    return (double) a / b;
                }
            case '%' :
                return (double) a % b;
            case '^' :
                return Math.pow((double) a, b);
            default:
                System.out.println("Error: sign " + sign + " is not supported.");
                return Double.MIN_VALUE;
        }
    }
}
