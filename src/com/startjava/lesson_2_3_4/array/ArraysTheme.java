package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
        //1.Реверс значений массива.
        reverseArrayElements();
        //2. Произведение элементов массива.
        productArrayElements();
        //3.Удаление элементов массива
        deleteArrayElements();
        //4.Вывод алфавита лесенкой
        displayAlphabetLedder();
        //5. Заполнение массивами уникальными числами
        fillArrayWithUniqueNumbers();
    }

    private static void reverseArrayElements() {
        System.out.println("\n1. Reverse of array's elements");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        int length = numbers.length;
        System.out.print("Before reverse: [");
        print(length, numbers);
        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[--length];
            numbers[length] = temp;
        }
        System.out.print("After reverse: [");
        print(numbers.length, numbers);
    }

    private static void print(int length, int[] array) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + (i != length - 1 ? ", " :  "]\n"));
        }
    }

    private static void productArrayElements() {
        System.out.println("\n2. Product of array's elements");
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }
        int product = 1;
        for (int i = 1; i < length - 1; i++) {
            product *= multipliers[i];
            System.out.print(multipliers[i] + (i != length - 2 ?  " * " : " = " + product));
        }
    }

    private static void deleteArrayElements() {
        System.out.println("\n\n3. Deleting array's elements");
        float[] randomNumbers = new float[15];
        int length = randomNumbers.length;
        for (int i = 0; i < length; i++) {
            randomNumbers[i] = (float) Math.random();
        }
        print(length, randomNumbers);
        float middleCellNumber = randomNumbers[length / 2];
        System.out.println("\n" + middleCellNumber);
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (randomNumbers[i] > middleCellNumber) {
                randomNumbers[i] = 0;
                count++;
            }
        }
        print(length, randomNumbers);
        System.out.println("\nNumber of zeroed cells = " + count);
    }

    private static void print(int length, float[] array) {
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", array[i]);
            if (i == 7) {
                System.out.println();
            }
        }
    }

    private static void displayAlphabetLedder() {
        System.out.println("\n\n4. Output of alphabet using a ledder");
        char[] alphabet = new char[26];
        int length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    private static void fillArrayWithUniqueNumbers() {
        System.out.println("\n5.Filling array with unique numbers");
        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;
        uniqueNumbers[0] = (int) (60 + Math.random() * 40);

        for (int i = 1; i < length; i++) {
            int count = 0;
            do {
                count = 0;
                uniqueNumbers[i] = (int) (60 + Math.random() * 40);
                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[i] != uniqueNumbers[j]) {
                        count++;
                    }
                }
            } while (count != i);
        }
        Arrays.sort(uniqueNumbers);
        for (int i = 1; i <= 30; i++) {
            System.out.print(uniqueNumbers[i - 1] + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}