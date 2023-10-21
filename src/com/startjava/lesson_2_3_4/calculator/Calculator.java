package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static double calculate(String mathExpression) throws RuntimeException {
        String[] elements = mathExpression.split(" ");
        if(elements.length != 3) {
            throw new IllegalArgumentException();
        }
        int a = Integer.parseInt(elements[0]);
        char sign = elements[1].charAt(0);
        int b = Integer.parseInt(elements[2]);
        if(a % 1 != 0 || b % 1 != 0) {
            throw new NumberFormatException();
        }
        if(a < 0 || b < 0) {
            throw new RuntimeException();
        }
        return switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            case '^' -> Math.pow((double) a, b);
            default -> throw new IllegalStateException("");
        };
    }
}

