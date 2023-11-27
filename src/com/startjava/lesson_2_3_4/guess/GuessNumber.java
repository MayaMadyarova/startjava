package com.startjava.lesson_2_3_4.guess;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    static final int NUMBER_OF_PLAYERS = 3;
    static final int ROUNDS = 3;
    private Player[] players = new Player[NUMBER_OF_PLAYERS];

    Scanner console = new Scanner(System.in);

    public GuessNumber(String[] names) {
        for(int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void play() {
        System.out.println("The game begins! Each player has 10 attempts for one round." +
                " \n In the game there are 3 rounds.");
        for(int i = 1; i <= ROUNDS; i++) {
            System.out.println("Round " + i + " starts.");
            playRound();
            for(Player player : players) {
                printAllNumbers(player);
                player.clear();
            }
            if(i != ROUNDS) {
                System.out.println("\nEnd of " + i + " round. \nFor next round press \"Enter\" ");
                console.nextLine();
                console.nextLine();
            }
        }
        determineWinner();
    }

    public void playRound() {
        shufflePlayers();
        int secretNumber = (int) (1 + Math.random() * Player.MAX);
        while (hasAttempt()) {
            for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
                if (isGuessed(secretNumber, players[i])) {
                    players[i].incrementScore();
                    return;
                }
            }
        }
    }

    private void shufflePlayers() {
        for(int i = NUMBER_OF_PLAYERS - 1; i > 0; i--) {
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
        int number = 0;
        do {
            System.out.println("Player " + player.getName() + " input your number from interval (0, 100]");
            number = console.nextInt();
            if(player.setNumber(number)) {
                break;
            }
            System.out.println("Your number is out of acceptable range. Try again.");
        } while(true);
        return number;
    }

    private void printAllNumbers(Player player) {
        System.out.println("\nAll numbers, named by player " + player.getName());
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }

    public void determineWinner() {
        int[] wins = new int[ROUNDS + 1];
        for(Player player : players) {
            System.out.println("\nPlayer " + player.getName() + " guessed " + player.getScore() + " times.");
            for(int i = 0; i <= ROUNDS; i++) {
                if (player.getScore() == i) {
                    wins[i]++;
                }
            }
            if ((player.getScore() > ROUNDS / 2) || (wins[0] == 2 && wins[1] == 1)) {
                System.out.println("Player " + player.getName() + " wins!");
            }
            player.setScore(0);
        }
        if(wins[0] == ROUNDS || (wins[1] == 2 && wins[0] == 1)) {
            System.out.println("Nobody wins.");
        }
        if(wins[1] == ROUNDS) {
            System.out.println("Count is even");
        }
    }
}

