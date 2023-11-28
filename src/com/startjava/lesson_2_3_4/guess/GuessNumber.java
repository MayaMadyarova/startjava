package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    static final int NUMBER_OF_PLAYERS = 3;
    static final int ROUNDS = 3;
    private Player[] players = new Player[NUMBER_OF_PLAYERS];

    Scanner console = new Scanner(System.in);

    public GuessNumber(String[] names) {
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void play() {
        System.out.println("The game begins! Each player has 10 attempts for one round." +
                " \n In the game there are 3 rounds.");
        for (int i = 1; i <= ROUNDS; i++) {
            System.out.println("Round " + i + " starts.");
            playRound();
            for (Player player : players) {
                printAllNumbers(player);
                player.clear();
            }
            if (i != ROUNDS) {
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
        int count = 0;
        do {
            for (Player player : players) {
                if (isGuessed(secretNumber, player)) {
                    player.incrementScore();
                    return;
                }
                hasAttempt(player);
            }
            count++;
        } while (count < Player.ATTEMPT_MAX);
    }


    private void shufflePlayers() {
        for (int i = NUMBER_OF_PLAYERS - 1; i > 0; i--) {
            int position = (int) (Math.random() * i);
            Player temp = players[position];
            players[position] = players[i];
            players[i] = temp;
        }
    }

    private boolean hasAttempt(Player player) {
        if (player.getAttempt() < Player.ATTEMPT_MAX) {
            return true;
        } else {
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
        System.out.println((number > secretNumber) ? "Number " + number + " is bigger than what " +
                "the computer made up" : "Number " + number + " is less than what the computer made up");
        return false;
    }

    private int inputNumber(Player player) {
        int number = 0;
        do {
            System.out.println("Player " + player.getName() + " input your number from interval (0, 100]");
            number = console.nextInt();
            if (player.setNumber(number)) {
                break;
            }
            System.out.println("Your number is out of acceptable range. Try again.");
        } while (true);
        return number;
    }

    private void printAllNumbers(Player player) {
        System.out.println("\nAll numbers, named by player " + player.getName());
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }

    public void determineWinner() {
        int count1 = 0;
        int count0 = 0;
        int[] wins = new int[NUMBER_OF_PLAYERS];
        for(int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            wins[i] = players[i].getScore();
            System.out.println("\nPlayer " + players[i].getName() + " guessed " +
                    players[i].getScore() + " times.");
            if (wins[i] == 1) {
                count1++;
                if (count1 == NUMBER_OF_PLAYERS) {
                    System.out.println("Score is even");
                }
            }
            if (wins[i] == 0) {
                count0++;
                if (count0 == NUMBER_OF_PLAYERS) {
                    System.out.println("Nobody wins");
                }
            }
            players[i].setScore(0);
        }
        for(int i = 0; i < 1; i++) {
            if(wins[i] > wins[i + 1] && wins[i] > wins[ i + 2]) {
                System.out.println("Player " + players[i].getName() + " wins!");
            } else if(wins[i + 2] > wins[i] && wins[i + 2] > wins[i + 1]) {
                    System.out.println("Player " + players[i + 2].getName() + " wins!");
            } else if(wins[i + 1] > wins[i] && wins[i + 1] > wins[i + 2]) {
                    System.out.println("Player " + players[i + 1].getName() + " wins!");
            }
        }
    }
}
