package com.startjava.lesson_2_3_4.array;

import org.w3c.dom.ls.LSOutput;

public class ArraysTheme {
    public static void main(String[] args) {
        //1. Реверс значений массива.
        System.out.println("\n1. Reverse of array's elements");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        int len = numbers.length;
        int[] reverseNumbers = new int[len];
        System.out.print("Before reverse: [");
        for (int i = 0; i < len; i++) {
            if(i == len-1) {
                System.out.println(numbers[i] + "]");
            } else
            System.out.print(numbers[i] + ", ");
        }
        System.out.print("After reverse: [");
        for (int i = 0; i < len; i++) {
            reverseNumbers[i] = numbers[len - 1 - i];
            if(i == len - 1) {
                System.out.println(reverseNumbers[i] + "]");
            } else {
                System.out.print(reverseNumbers[i] + ", ");
            }
        }
        //2. Произведение элементов массива.
        System.out.println("\n2. Product of array's elements");
        System.out.println();
        int[] numbers2 = new int[10];
        for (int i = 0; i <= 9; i++) {
            numbers2[i] = i;
        }
        int sum = 1;
        int length = numbers2.length;
        for (int i = 1; i < length - 1; i++) {
            sum = sum * numbers2[i];
            if(i == length - 2) {
                System.out.print(numbers2[i] + " ");
            } else {
                System.out.print(numbers2[i] + " * ");
            }
        }
        System.out.println(" = " + sum);

        //3.Удаление элементов массива
        System.out.println("\n3. Deleting array's elements");
        float[] floats = new float[15];
        int leng = floats.length;
        int count = 0;
        for (int i = 0; i < leng; i++) {
            floats[i] = (float) Math.random();
            System.out.printf("%.3f ", floats[i]);
            count++;
            if (count == 8) {
                System.out.println();
            }
        }
        int med = leng / 2;
        float number = floats[med];
        System.out.println("\n" + floats[med]);
        float[] floatsCopy = floats;
        int count2 = 0;
        for (int i = 0; i < leng; i++) {
            if (floatsCopy[i] > floats[med]) {
                floatsCopy[i] = (float) 0.000;
            }
            System.out.printf("%.3f ", floatsCopy[i]);
            count2++;
            if (count2 == 8) {
                System.out.println();
            }
        }

        //4.Вывод алфавита лесенкой
        System.out.println("\n\n4. Output of alphabet using a ledder");
        char[] chars = new char[26];
        int j = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            chars[j++] = ch;
        }
        for (int i = 25; i >= 0; i--) {
            System.out.println();
            for (j = 25; j >= i; j--) {
                System.out.print(chars[j]);
            }
        }
        //5. Заполнение массивами уникальными числами
        System.out.println("\n\n5.Filling array with unique numbers\n");
        int[] array = new int[30];
        array[0] = (int) (60 + Math.random() * 40);
        for (int i = 1; i < 30; i++) {
            array[i] = (int) (60 + Math.random() * 40);
            int counter = 0;
            do {
                counter = 0;
                for (j = 0; j < i; j++) {
                    if (array[i] != array[j]) {
                        counter++;
                    }
                }
                if (counter != i) {
                    array[i] = (int) (60 + Math.random() * 40);
                }
            } while (counter != i);
        }
        int count3 = 0;
        for (int i = 0; i < 30; i++) {
            System.out.print(array[i] + " ");
            count3++;
            if (count3 % 10 == 0) {
                System.out.println();
            }
        }
    }
}