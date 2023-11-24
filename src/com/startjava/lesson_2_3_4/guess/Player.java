package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt;
    private int numberOfWins;
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

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void addNumberOfWins() {
        numberOfWins++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void setNumber(int number) {
        if(number > 0 && number <= 100) {
            numbers[attempt++] = number;
        } else {
            System.out.println("Your number is out of acceptable range. Try again.");
        }
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}
