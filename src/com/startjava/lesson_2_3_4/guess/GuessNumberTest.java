package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
 
public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input the name of the first player");
        Player player1 = new Player(console.nextLine());
        System.out.println("Input the name of the second player");
        Player player2 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;

        do {
            game.play();
            do {
                System.out.println("Do You want to continue?[yes/no]");
                answer = console.nextLine();
            } while(!answer.equals("no") && !answer.equals("yes"));
        } while(answer.equals("yes"));
        System.out.println("The game is over");
    }
}
