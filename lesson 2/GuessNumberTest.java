public class GuessNumberTest {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Input the name of the first player");
        GuessNumber.player(s.nextLine());
        System.out.println("Input the name of the second player");
        GuesNumber.player(s.nextLine());
        do {
            GuessNumber guessNumber = new GuessNumber();
            do {
                System.out.println("Do You want to continue?[yes/no]");
            } while(str = s.nextLine().equals("no") && s.nextLine().equals("yes"))
        } while(str.equals("yes"));
        System.out.println("The game is over");
    }
}