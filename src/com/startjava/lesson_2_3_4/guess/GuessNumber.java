package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    private Player player1;
    private Player player2;
    int number;
    int attempt = 0;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void play() {
        System.out.println("The game begins! Each player has 10 attempts.");
        int secretNumber = (int) (1 + Math.random() * 100);
        while (attempt <= 11) {
            attempt += 1;
            if (isGuessed(secretNumber, player1, attempt)) {
                break;
            }
            if (isGuessed(secretNumber, player2, attempt)) {
                break;
            }
        }
        printAndDelete(player1, player1.getNumbers());
        printAndDelete(player2, player2.getNumbers());
    }


    private boolean isGuessed(int secretNumber, Player player, int attempt) {
        if(attempt < 11){
            System.out.println("Player " + player.getName() + " input your number");
            number = player.addNumber(console.nextInt());
            int[] numbers = player.getNumbers();
            numbers[attempt - 1] = number;
            if (number == secretNumber) {
                System.out.println("Player " + player.getName() + " has guessed number " + number + " from " +
                        attempt + " attempt!");
                return true;
            } else if (number > secretNumber) {
                System.out.println("Number " + number + " is bigger than what the computer made up");
            } else if (number < secretNumber) {
                System.out.println("Number " + number + " is less than what the computer made up");
            }
        } else if(attempt == 11){
            System.out.println("Player " + player.getName() + " has run out of tries");
        }
        return false;
    }

        public void printAndDelete (Player player,int[] numbers){
        System.out.println("\nAll numbers, named by player " + player.getName());
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < numbersCopy.length; i++) {
            if (numbersCopy[i] != 0) {
                System.out.print(numbersCopy[i] + " ");
            }
        }
        Arrays.fill(numbers, 0);
    }
}
