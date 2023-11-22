package com.startjava.lesson_2_3_4.guess;

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
        while(true) {
            if (isGuessed(secretNumber, player1)) {
                break;
            }
            if (isGuessed(secretNumber, player2)) {
                break;
            }
            if(player1.getAttempt() == 10) {
                System.out.println("Player " + player1.getName() + " has run out of tries");
                if(player2.getAttempt() == 10) {
                    System.out.println("Player " + player2.getName() + " has run out of tries");
                    break;
                }
            }
        }
        player1.print();
        player2.print();
        player1.delete();
        player2.delete();
    }

    private boolean isGuessed(int secretNumber, Player player) {
        int attempt = player.getAttempt();
        if(attempt < 10) {
            System.out.println("Player " + player.getName() + " input your number");
            int number = console.nextInt();
            player.setNumbers(number);
            if (number == secretNumber) {
                System.out.println("Player " + player.getName() + " has guessed number " + number + " from " +
                        (player.getAttempt() + 1) + " attempt!");
                return true;
            }
            if (number > secretNumber) {
                System.out.println("Number " + number + " is bigger than what the computer made up");
            } else if (number < secretNumber) {
                System.out.println("Number " + number + " is less than what the computer made up");
            }
        }
        return false;
    }
}
