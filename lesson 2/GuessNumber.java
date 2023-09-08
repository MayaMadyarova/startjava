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
        while(true) {
            if(!guess(secretNumber, player1)) {
                if(guess(secretNumber, player2)) {
                    break;
                }
            } else {
                break;
            }
        }
    }

     private boolean guess(int secretNumber, Player player) {
        System.out.println("Player " + player.getName() + " input your number");
        player.setNumber(console.nextInt());
        int number = player.getNumber();
        if(number == secretNumber) {
            System.out.println("Number " + number + " is what the computer made up." + player.getName() + " you win!");
            return true;
        } else if(number > secretNumber) {
            System.out.println("Number " + number + " is bigger than what the computer made up");
        } else if(number < secretNumber) {
            System.out.println("Number " + number + " is less than what the computer made up");
        }
        return false;
    }
}

