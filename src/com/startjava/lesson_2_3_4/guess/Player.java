package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt;
    private int score;
    private int[] numbers = new int[ATTEMPT_MAX];
    static final int MAX = 100;
    static final int MIN = 0;
    static final int ATTEMPT_MAX = 10;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public boolean setNumber(int number) {
        if(number > MIN && number <= MAX) {
            numbers[attempt++] = number;
            return true;
        }
        return false;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}
