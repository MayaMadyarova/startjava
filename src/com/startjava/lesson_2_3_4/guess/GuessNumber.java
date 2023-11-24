package com.startjava.lesson_2_3_4.guess;

import java.sql.DataTruncation;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    private Player[] players = new Player[3];

    public GuessNumber(String name1, String name2, String name3) {
        players[0] = new Player(name1);
        players[1] = new Player(name2);
        players[2] = new Player(name3);
    }

    public void play() {
        System.out.println("The game begins! Each player has 10 attempts for one round.");
        orderOfPlay(players);
        final int ROUND = 3;
        for(int k = 1; k <= ROUND; k++) {
            System.out.println("Round " + k + " starts.");
            int secretNumber = (int) (1 + Math.random() * 100);
            outer:
            while (hasAttempt(players[0]) || hasAttempt(players[1]) || hasAttempt(players[2])) {
                for (int i = 0; i < players.length; i++) {
                    if (isGuessed(secretNumber, players[i])) {
                        players[i].addNumberOfWins();
                        break outer;
                    }
                }
            }
            for(int i = 0; i < players.length; i++) {
                printAllNumbers(players[i]);
                players[i].clear();
            }
            System.out.println("\nEnd of " + k + " round.");
        }
        determineWinner(players);
    }

    private Player[] orderOfPlay(Player[] players) {
        for(int i = players.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * i);
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
        return players;
    }

    private boolean hasAttempt(Player player) {
        if(player.getAttempt() < 10) {
            return true;
        }
        System.out.println("Player " + player.getName() + " has run out of attempts");
        return false;
    }

    private boolean isGuessed(int secretNumber, Player player) {
        int number = inputNumber(player);
        if (number == secretNumber) {
            System.out.println("Player " + player.getName() + " has guessed number " + number + " from " +
                    player.getAttempt() + " attempt!");
            return true;
        }
        System.out.println((number > secretNumber) ? "Number " + number + " is bigger than what the computer made up" :
            "Number " + number + " is less than what the computer made up");
        return false;
    }

    private int inputNumber(Player player) {
        int number = 123;
        do {
            System.out.println("Player " + player.getName() + " input your number from interval (0, 100]");
            number = console.nextInt();
            player.setNumber(number);
        } while(number > 100 || number <= 0);
        return number;
    }

    private void printAllNumbers(Player player) {
        System.out.println("\nAll numbers, named by player " + player.getName());
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }

    public static void determineWinner(Player[] players) {
        int max = Math.max(players[0].getNumberOfWins(), (Math.max(players[1].getNumberOfWins(), players[2].getNumberOfWins())));
        for (int i = 0; i < players.length - 1; i++) {
            if (max == players[i].getNumberOfWins()) {
                System.out.println("Player " + players[i].getName() + " has won! Guessed " + max + " times.");
            }
        }
    }
}
