package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public int[] getNumbers() {
        int[] copyNumbers = Arrays.copyOfRange(numbers, 0, attempt);
        return copyNumbers;
    }

    public void addNumber(int number) {
        numbers[attempt++] = number;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}
