package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    static final int PLAYERS_LIMIT = 3;
    private static final int ROUNDS = 3;
    private Player[] players = new Player[PLAYERS_LIMIT];

    Scanner console = new Scanner(System.in);

    public GuessNumber(String[] names) {
        for (int i = 0; i < PLAYERS_LIMIT; i++) {
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

    private void playRound() {
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
        for (int i = PLAYERS_LIMIT - 1; i > 0; i--) {
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

    private void determineWinner() {
        int count1 = 0;
        int count0 = 0;
        int[] wins = new int[PLAYERS_LIMIT];
        for(int i = 0; i < PLAYERS_LIMIT; i++) {
            wins[i] = players[i].getScore();
            System.out.println("\nPlayer " + players[i].getName() + " guessed " +
                    players[i].getScore() + " times.");
            if (wins[i] == 1) {
                count1++;
                if (count1 == PLAYERS_LIMIT) {
                    System.out.println("Score is even");
                }
            }
            if (wins[i] == 0) {
                count0++;
                if (count0 == PLAYERS_LIMIT) {
                    System.out.println("Nobody wins");
                }
            }
            players[i].setScore(0);
        }
        int max = wins[1];
        if(wins[0] > wins[1]) {
            max = wins[0];
        }
        if(wins[2] > max) {
            max = wins[2];
        }
        if(max == wins[0]) {
            System.out.println("Player " + players[0].getName() + " wins!");
        } else if(max == wins[1]) {
            System.out.println("Player " + players[1].getName() + " wins!");
        } else {
            System.out.println("Player " + players[2].getName() + " wins!");
        }
    }
}
