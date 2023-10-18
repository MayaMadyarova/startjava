package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int a;
    public static int b;
    public static char sign;
    public static double result;
    String[] elements = new String[3];

    Calculator(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        a = Integer.parseInt(elements[0]);
        b = Integer.parseInt(elements[2]);
        sign = elements[1].charAt(0);
    }

    static double calculate() {
        result =
        switch(sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            case '^' -> Math.pow((double) a, b);
            default -> throw new IllegalStateException();
        };
        return result;
    }
}