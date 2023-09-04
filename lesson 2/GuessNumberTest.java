import java.util.Scanner;
 
public class GuessNumberTest {

    public static void main(String[] args) {
        String answer;
        Scanner s = new Scanner(System.in);
        Player playerOne = new Player();
        Player playerTwo = new Player();
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        System.out.println("Input the name of the first player");
        playerOne.setName(s.nextLine());
        System.out.println("Input the name of the second player");
        playerTwo.setName(s.nextLine());
        int number1;
        int number2;
        

        do {
            int secretNumber = (int)(1 + Math.random() * 100);
            do {
                System.out.println("The first player " + playerOne.getName() + " input your number");
                playerOne.setNumber(s.nextInt());
                number1 = playerOne.getNumber();
                guessNumber.guessNumber(number1, secretNumber);
                if(number1 != secretNumber) {
                    System.out.println("The second player " + playerTwo.getName() + " input your number");
                    playerTwo.setNumber(s.nextInt());
                    number2 = playerTwo.getNumber();
                guessNumber.guessNumber(number2, secretNumber);
                }
            } while (number1 != secretNumber && playerTwo.getNumber() != secretNumber);
            do {
                System.out.println("Do You want to continue?[yes/no]");
                answer = s.nextLine();
            } while(!answer.equals("no") && !answer.equals("yes"));
        } while(answer.equals("yes"));
        System.out.println("The game is over");
    }
}