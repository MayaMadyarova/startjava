package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    private Player[] players = new Player[NUMBER_OF_PLAYERS];
    static final int NUMBER_OF_PLAYERS = 3;
    static final int ROUNDS = 3;

    public GuessNumber(String[] names) {
        for(int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void play() {
        System.out.println("The game begins! Each player has 10 attempts for one round.");
        for(int i = 1; i <= ROUNDS; i++) {
            System.out.println("Round " + i + " starts.");
            playRound();
            System.out.println("\nEnd of " + i + " round.");
        }
        determineWinner(players);
    }

    public void playRound() {
        shufflePlayers(players);
        int secretNumber = (int) (1 + Math.random() * Player.MAX);
        while (hasAttempt()) {
            for (int j = 0; j < players.length; j++) {
                if (isGuessed(secretNumber, players[j])) {
                    players[j].incrementScore();
                    for(Player player : players) {
                        printAllNumbers(player);
                        player.clear();
                    }
                    return;
                }
            }
        }
    }

    private void shufflePlayers(Player[] players) {
        for(int i = players.length - 1; i > 0; i--) {
            int randomNumber = (int) (Math.random() * i);
            Player temp = players[randomNumber];
            players[randomNumber] = players[i];
            players[i] = temp;
        }
    }

    private boolean hasAttempt() {
        for (Player player : players) {
            if (player.getAttempt() < Player.ATTEMPT_MAX) {
                return true;
            }
            System.out.println("Player " + player.getName() + " has run out of attempts");
        }
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
            if(!player.setNumber(number)) {
                System.out.println("Your number is out of acceptable range. Try again.");
            }
        } while(number > Player.MAX || number <= Player.MIN);
        return number;
    }

    private void printAllNumbers(Player player) {
        System.out.println("\nAll numbers, named by player " + player.getName());
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }

    public static void determineWinner(Player[] players) {
        int max = 0;
        for(Player player : players) {
            if(player.getScore() > max) {
                max = player.getScore();
            }
        }
        for (Player player : players) {
            if (max == player.getScore()) {
                System.out.println("Player " + player.getName() + " has won! Guessed " + max + " times.");
            }
        }
    }
}
