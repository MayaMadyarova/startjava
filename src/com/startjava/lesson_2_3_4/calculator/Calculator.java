package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int a;
    private static int b;
    private static char sign;
    private static double result;

    Calculator(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        a = Integer.parseInt(elements[0]);
        sign = elements[1].charAt(0);
        b = Integer.parseInt(elements[2]);
    }


    static void check() {
        try {
            boolean check1 = (a > 0 && b > 0);
        }
        catch (Exception e) {
            RuntimeException exception;
            System.out.println("Numbers must be positive");
        }
        try {
            boolean check2 = (a % 1 == 0 && b % 1 == 0);
        }
        catch (Exception e) {
            RuntimeException exception;
            System.out.println("Numbers must be integers");
        }

    }

    static double calculate() {
        result =
        switch(sign) {
            case '+' : {
                yield a + b;
            }
        case '-' : {
                yield a - b;
            }
            case '*' : {
                yield a * b;
            }
            case '/' : {
                if(b == 0) {
                    System.out.println("You can't devide by zero!");
                    yield Double.MIN_VALUE;
                } else {
                    yield (double) a / b;
                }
            }
            case '%' : {
                yield a % b;
            }
            case '^' : {
                yield Math.pow((double) a, b);
            }
            default : {
                System.out.println("Error: sign " + sign + " is not supported.");
                yield Double.MIN_VALUE;
            }
        };
        return result;
    }
}