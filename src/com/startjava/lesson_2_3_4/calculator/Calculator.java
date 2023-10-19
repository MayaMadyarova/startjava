package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int a;
    public static int b;
    public static char sign;
    public static double result;
    public static String[] elements;



    static double calculate(String[] elements) {
        try {
            a = Integer.parseInt(elements[0]);
            sign = elements[1].charAt(0);
            b = Integer.parseInt(elements[2]);
            if (a < 0 || b < 0) {
                System.out.println("Numbers must be positive!");
            } else {
                return switch (sign) {
                    case '+' -> a + b;
                    case '-' -> a - b;
                    case '*' -> a * b;
                    case '/' -> a / b;
                    case '%' -> a % b;
                    case '^' -> Math.pow((double) a, Calculator.b);
                    default -> throw new IllegalStateException("");
                };
            }
        }catch (NumberFormatException e) {
            System.out.println("Numbers must be integers!");
        }
        return Double.MIN_VALUE;
    }
}

