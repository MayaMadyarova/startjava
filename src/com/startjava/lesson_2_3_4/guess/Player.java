package com.startjava.lesson_2_3_4.guess;

public class Player {

    private String name;
    private int number;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int addNumber(int number) {
        this.number = number;
        return number;
    }
    public int[] getNumbers() {
        return numbers;
    }
}
