import java.util.Scanner;
 
public class GuessNumberTest {

    public static void main(String[] args) {
        String answer;
        Scanner s = new Scanner(System.in);
        System.out.println("Input the name of the first player");
        Player playerOne = new Player(s.nextLine());
        System.out.println("Input the name of the second player");
        Player playerTwo = new Player(s.nextLine());
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

        do {
            guessNumber.game(playerOne, playerTwo);
            do {
                System.out.println("Do You want to continue?[yes/no]");
                answer = s.nextLine();
            } while(!answer.equals("no") && !answer.equals("yes"));
        } while(answer.equals("yes"));
        System.out.println("The game is over");
    }
}