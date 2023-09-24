package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[]args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Input the first number: ");
            calculator.setA(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Input the sign of the mathematical operation: ");
            calculator.setSign(scanner.nextLine().charAt(0));
            System.out.println("Input the second number: ");
            calculator.setB(scanner.nextInt());
            scanner.nextLine();
            calculator.calculate();
            do {
                System.out.println("Do you want to continue calculation? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (answer.equals("yes"));
    }
}