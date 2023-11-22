package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt = 0;
    private int[] numbers = new int[10];
    private int i = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] setNumbers(int number) {
        numbers[attempt++] = number;
        return numbers;
    }

    public int getAttempt() {
        return attempt;
    }

    public void print (){
        System.out.println("\nAll numbers, named by player " + getName());
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        for (int number: numbersCopy) {
            if(number != 0) {
                System.out.print(number + " ");
            }
        }
    }

    public void delete() {
        Arrays.fill(numbers, 0);
        attempt = 0;
    }
}
