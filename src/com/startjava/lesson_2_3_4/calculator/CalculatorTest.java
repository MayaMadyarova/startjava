package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        double result =0;

        do {
            System.out.println("Input the mathematical expression in the format: 2 ^ 10");
            String mathExpression = scanner.nextLine();
            try {
                new Calculator(mathExpression);
                if(Calculator.a < 0 || Calculator.b < 0) {
                    try {
                        throw new RuntimeException();
                    }
                    catch (RuntimeException e) {
                        System.out.println("Numbers must be positive!");
                    }
                }
                result = Calculator.calculate();
                outputResult(result, mathExpression);
            }
            catch (NumberFormatException e) {
                System.out.println("Numbers must be integers!");
            }
            catch (ArithmeticException e) {
                System.out.println("You can't devide by zero!");
            }
            catch (IllegalStateException e) {
                System.out.println("Sign is not supported!");
            }


            System.out.println("Do you want to continue calculation? [yes/no]: ");
            answer = scanner.nextLine();
            if (!answer.equals("no") && !answer.equals("yes")) {
                System.out.println("Do you want to continue calculation? [yes/no]: ");
                answer = scanner.nextLine();
            }
        } while (answer.equals("yes"));
    }

    private static void outputResult(double result, String mathExpression) {
        System.out.println(result > 0 ? mathExpression + " = "
                + new DecimalFormat("#.###").format(result) : "");
    }
}

