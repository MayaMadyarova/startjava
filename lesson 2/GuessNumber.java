public class GuessNumber {
    Player playerOne;
    Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    int secretNumber;

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