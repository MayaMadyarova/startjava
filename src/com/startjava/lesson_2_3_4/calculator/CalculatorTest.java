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
                } catch (NumberFormatException e) {
                    System.out.println("Numbers must be integers!");
                } catch (IllegalArgumentException e) {
                    System.out.println("The length of mathematical expression is not correct!");
                } catch (ArithmeticException e) {
                    System.out.println("You can't devide by zero!");
                } catch (IllegalStateException e) {
                    System.out.println("Sign is not supported!");
                } catch (RuntimeException e) {
                    System.out.println("Numbers must be positive!");
                }
            }
            System.out.println("Do you want to continue calculation? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }
}

