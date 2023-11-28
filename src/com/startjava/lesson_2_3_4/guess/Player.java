package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    static final int MAX = 100;
    static final int MIN = 1;
    static final int ATTEMPT_MAX = 10;
    private String name;
    private int attempt;
    private int score;
    private int[] numbers = new int[ATTEMPT_MAX];

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

    public void setScore(int score) {
        this.score = score;}

    public void incrementScore() {
        score++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public boolean setNumber(int number) {
        if(number >= MIN && number <= MAX) {
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
