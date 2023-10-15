package com.startjava.lesson_2_3_4.guess;

public class Player<arr> {

    private String name;
    private int number;
    int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int setNumber(int number) {
        this.number = number;
        return number;
    }
}
