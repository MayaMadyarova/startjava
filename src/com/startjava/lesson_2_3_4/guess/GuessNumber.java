package com.startjava.lesson_2_3_4.guess;

import java.sql.DataTruncation;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void play() {
        System.out.println("The game begins! Each player has 10 attempts.");
        int secretNumber = (int) (1 + Math.random() * 100);
        while(checkAttempt(player1) || checkAttempt(player2)) {
            int numberPlayer1 = inputNumber(player1);
            if(isGuessed(secretNumber,player1,numberPlayer1)){
                break;
            }
            int numberPlayer2 = inputNumber(player2);
            if(isGuessed(secretNumber,player2,numberPlayer2)){
                break;
            }
        }
        printAllNumbers(player1);
        printAllNumbers(player2);
        player1.clear();
        player2.clear();
    }

    private boolean checkAttempt(Player player) {
        if(player.getAttempt() < 10) {
            return true;
        } else if(player.getAttempt() == 10) {
            System.out.println("Player " + player.getName() + " has run out of attempts");
        }
        return false;
    }

    private int inputNumber(Player player) {
        System.out.println("Player " + player.getName() + " input your number");
        int number = console.nextInt();
        player.addNumber(number);
        return number;
    }

    private boolean isGuessed(int secretNumber, Player player, int number) {
        if (number == secretNumber) {
            System.out.println("Player " + player.getName() + " has guessed number " + number + " from " +
                    player.getAttempt() + " attempt!");
            return true;
        }
        if (number > secretNumber) {
            System.out.println("Number " + number + " is bigger than what the computer made up");
        } else if (number < secretNumber) {
            System.out.println("Number " + number + " is less than what the computer made up");
        }
        return false;
    }

    private void printAllNumbers(Player player) {
        System.out.println("\nAll numbers, named by player " + player.getName());
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }
}
