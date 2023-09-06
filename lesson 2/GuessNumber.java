import java.util.Scanner;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        int secretNumber = (int)(1 + Math.random() * 100);
        do {
            boolean isEqual = guessNumber(inputNumber(player1), secretNumber);
            if(!isEqual) {
                guessNumber(inputNumber(player2), secretNumber);
            }
        } while (player1.getNumber() != secretNumber && player2.getNumber() != secretNumber);
    }

    private boolean guessNumber(int number, int secretNumber) {
        boolean isEqual = true;
        if(number > secretNumber) {
            System.out.println("Number " + number + " is bigger than what the computer made up");
            return false;
        } else if (number < secretNumber) {
            System.out.println("Number " + number + " is less than what the computer made up");
            return false;
        } else {
            System.out.println("Number " + number + " is what the computer made up. You win!");
            return true;
        }
    }

    private int inputNumber(Player player) {
        System.out.println("Player " + player.getName() + " input your number");
        player.setNumber(console.nextInt());
        int number = player.getNumber();
        return number;
    }
}