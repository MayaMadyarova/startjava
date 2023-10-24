package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        if(elements.length != 3) {
            throw new IllegalArgumentException("The length of mathematical expression is not correct!");
        }
        char sign = elements[1].charAt(0);
        int a;
        int b;
        try {
            a = Integer.parseInt(elements[0]);
            b = Integer.parseInt(elements[2]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Numbers must be integers!");
        }
        checkNumbers(a, b);
        return switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> (double)a / b;
            case '%' -> a % b;
            case '^' -> Math.pow((double) a, b);
            default -> throw new IllegalStateException("Sign is not supported!");
        };
    }

    static void checkNumbers(int a, int b) {
        if((a <= 0)|| (b <= 0)) {
            throw new RuntimeException("Numbers must be positive!");
        }
    }
}

