package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String answer = null;

        do {
            System.out.println("Input the mathematical expression in such format: 2 ^ 10");
            String string = scanner.nextLine();
            Calculator calculator = new Calculator(string);
            double result = calculator.calculate();
            if(result != Double.MIN_VALUE) {
                System.out.println(string + " = " + new DecimalFormat("#.###").format(result));
            }
            do {
                System.out.println("Do you want to continue calculation? [yes/no]: ");
                answer = scanner.nextLine();
            } while(!answer.equals("no") && !answer.equals("yes"));
        } while (answer.equals("yes"));
    }
}