import java.util.Scanner;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }   

    public void play() {
        int secretNumber = (int) (1 + Math.random() * 100);
        while(!guess(inputNumber(player1), secretNumber, player1) && !guess(inputNumber(player2), secretNumber, player2)) {
            if(!guess(inputNumber(player1), secretNumber, player1)) {
                guess(inputNumber(player2), secretNumber, player2);
            } else 
            break;
        }
    }

    private int inputNumber(Player player) {
        System.out.println("Player " + player.getName() + " input your number");
        player.setNumber(console.nextInt());
        return player.getNumber();
    }

     private boolean guess(int number, int secretNumber, Player player) {
        if(number == secretNumber) {
            System.out.println("Number " + number + " is what the computer made up." + player.getName() + " you win!");
            return true;
        }
        if(number > secretNumber) {
            System.out.println("Number " + number + " is bigger than what the computer made up");
        }
        if (number < secretNumber) {
            System.out.println("Number " + number + " is less than what the computer made up");
        }
        return false;
    }
}

