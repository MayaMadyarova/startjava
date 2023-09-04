import java.util.Scanner;

public class GuessNumber {
    Player playerOne;
    Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    Scanner s = new Scanner(System.in);
    int secretNumber = (int)(1 + Math.random() * 100);

    public void game(Player playerOne, Player playerTwo) {
            do {
                System.out.println("The first player " + playerOne.getName() + " input your number");
                playerOne.setNumber(s.nextInt());
                int number1 = playerOne.getNumber();
                guessNumber(number1, secretNumber);
                if(number1 != secretNumber) {
                    System.out.println("The second player " + playerTwo.getName() + " input your number");
                    playerTwo.setNumber(s.nextInt());
                    int number2 = playerTwo.getNumber();
                guessNumber(number2, secretNumber);
                }
            } while (playerOne.getNumber() != secretNumber && playerTwo.getNumber() != secretNumber);
    }

    public void guessNumber(int number, int secretNumber) {
        if(number > secretNumber) {
            System.out.println("Number " + number + " is bigger than what the computer made up");
        } else if (number < secretNumber) {
            System.out.println("Number " + number + " is less than what the computer made up");
        } else {
            System.out.println("Number " + number + " is what the computer made up. You win!");
        }
    }
}