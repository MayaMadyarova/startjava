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
                try {
                    double result = Calculator.calculate(mathExpression);
                    System.out.println(mathExpression + " = " + new DecimalFormat("#.###").format(result));
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Do you want to continue calculation? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }
}

