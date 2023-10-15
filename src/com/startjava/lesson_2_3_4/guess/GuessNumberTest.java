package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
 
public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input the name of the first player");
        String name1 = console.nextLine();
        System.out.println("Input the name of the second player");
        String name2 = console.nextLine();
        GuessNumber game = new GuessNumber(name1, name2);
        String answer;

        do {
            game.play();
            do {
                System.out.println("\nDo You want to continue?[yes/no]");
                answer = console.nextLine();
            } while(!answer.equals("no") && !answer.equals("yes"));
        } while(answer.equals("yes"));
        System.out.println("The game is over");
    }
}
