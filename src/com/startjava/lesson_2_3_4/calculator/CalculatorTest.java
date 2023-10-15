package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        do {
            System.out.println("Input the mathematical expression in the format: 2 ^ 10");
            String mathExpression = scanner.nextLine();
            double result = Calculator.calculate();
            outputResult(result, mathExpression);
            do {
                System.out.println("Do you want to continue calculation? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (answer.equals("yes"));
    }

    private static void outputResult(double result, String mathExpression) {
        System.out.println(result != Double.MIN_VALUE ? mathExpression + " = "
                + new DecimalFormat("#.###").format(result) : "");
    }
}

