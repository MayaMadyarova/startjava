package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Integer.parseInt;

public class Calculator<a> {
    private int a;
    private int b;
    private char sign;

    Calculator(String string) {
        String[] array = string.split(" ");
        a = Integer.parseInt(array[0]);
        sign = (array[1]).charAt(0);
        b = Integer.parseInt(array[2]);
    }


    double calculate() {
        double result = 0;
        switch(sign) {
            case '+' :
                result = (double) a + b;
                break;
            case '-' :
                result = (double) a - b;
                break;
            case '*' :
                result = (double) a * b;
                break;
            case '/' :
                if(b == 0) {
                    System.out.println("You can't devide by zero!");
                    return Double.MIN_VALUE;
                } else {
                    result = (double) a / b;
                }
                break;
            case '%' :
                result = (double) a % b;
                break;
            case '^' :
                result = Math.pow((double) a, b);
                break;
            default:
                System.out.println("Error: sign " + sign + " is not supported.");
                return Double.MIN_VALUE;
        }
        return result;
    }
}
