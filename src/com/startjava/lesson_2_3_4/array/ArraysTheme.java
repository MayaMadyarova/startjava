package com.startjava.lesson_2_3_4.array;

import org.w3c.dom.ls.LSOutput;

public class ArraysTheme {
    public static void main(String[] args) {
        //1.Реверс значений массива.
        reverseArrayElements();
        //2. Произведение элементов массива.
        productArrayElements();
        //3.Удаление элементов массива
        deleteArrayElements();
        //4.Вывод алфавита лесенкой
        displayAlphabetUsingLedder();
        //5. Заполнение массивами уникальными числами
        fillArrayWithUniqueNumbers();
    }

    private static void reverseArrayElements () {
        System.out.println("\n1. Reverse of array's elements");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        int length = numbers.length;
        System.out.print("Before reverse: [");
        printIntArray(length, numbers);
        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = temp;
        }
        System.out.print("After reverse: [");
        printIntArray(length, numbers);
    }

    private static void printIntArray ( int end, int array[]){
        for (int i = 0; i < end; i++) {
            if (i == end - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    private static void productArrayElements () {
        System.out.println("\n2. Product of array's elements");
        int[] intNumbers = new int[10];
        int length = intNumbers.length;
        for (int i = 0; i < length; i++) {
            intNumbers[i] = i;
        }
        int product = 1;
        for (int i = 1; i < length - 1; i++) {
            product *= intNumbers[i];
            System.out.print(i != length - 2 ? intNumbers[i] + " * " : intNumbers[i] + " = " + product);
        }
    }

    private static void deleteArrayElements() {
        System.out.println("\n\n3. Deleting array's elements");
        float[] floats = new float[15];
        int length = floats.length;
        for (int i = 0; i < length; i++) {
            floats[i] = (float) Math.random();
        }
        printFloats(length, floats);
        int median = length / 2;
        float number = floats[median];
        System.out.println("\n" + number);
        for (int i = 0; i < length; i++) {
            if (floats[i] > floats[median]) {
                floats[i] = (float) 0.000;
            }
        }
        printFloats(length, floats);
    }

    private static void printFloats(int length, float array[]) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", array[i]);
            count++;
            if (count == 8) {
                System.out.println();
            }
        }
    }

    private static void displayAlphabetUsingLedder() {
        System.out.println("\n\n4. Output of alphabet using a ledder");
        char[] chars = new char[26];
        int j = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            chars[j++] = ch;
        }
        for (int i = 25; i >= 0; i--) {
            for (j = 25; j >= i; j--) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }

    private static void fillArrayWithUniqueNumbers() {
        System.out.println("\n5.Filling array with unique numbers");
        int[] array = new int[30];
        array[0] = (int) (60 + Math.random() * 40);
        for (int i = 1; i < 30; i++) {
            array[i] = (int) (60 + Math.random() * 40);
            int count = 0;
            do {
                count = 0;
                for (int j = 0; j < i; j++) {
                    if (array[i] != array[j]) {
                        count++;
                    }
                }
                if (count != i) {
                    array[i] = (int) (60 + Math.random() * 40);
                }
            } while (count != i);
        }
        int count = 0;
        for (int i = 0; i < 30; i++) {
            System.out.print(array[i] + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}