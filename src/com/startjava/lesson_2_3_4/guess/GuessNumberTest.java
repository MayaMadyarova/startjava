package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
 
public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        GuessNumber game = new GuessNumber(introducePlayers(console));
        String answer = "yes";

        do {
            if(answer.equals("yes")) {
                game.play();
            }
            System.out.println("\nDo You want to continue?[yes/no]");
            answer = console.nextLine();
        } while(!answer.equals("no"));
        System.out.println("The game is over");
    }

    public static String[] introducePlayers(Scanner console) {
        String[] names = new String[GuessNumber.NUMBER_OF_PLAYERS];
        for (int i = 0; i < GuessNumber.NUMBER_OF_PLAYERS; i++) {
            System.out.println("Input the name of the first player");
            names[i] = console.nextLine();
        }
        return names;
    }
}
