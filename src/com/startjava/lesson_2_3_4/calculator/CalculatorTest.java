package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                System.out.println("Input the mathematical expression in the format: 2 ^ 10");
                String mathExpression = scanner.nextLine();
                String[] elements = mathExpression.split(" ");
                if (elements.length != 3) {
                    try {
                        throw new IndexOutOfBoundsException();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("The length of your mathemathical expression is not correct!");
                    }
                } else {
                    try {
                        double result = Calculator.calculate(elements);
                        outputResult(result, mathExpression);
                    } catch (ArithmeticException e) {
                        System.out.println("You can't devide by zero!");
                    } catch ( IllegalStateException e) {
                        System.out.println("Sign is not supported!");
                    }
                }
            }
            System.out.println("Do you want to continue calculation? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }

    private static void outputResult(double result, String mathExpression) {
        System.out.println(result != Double.MIN_VALUE ? mathExpression + " = "
                + new DecimalFormat("#.###").format(result) : "");
    }
}

