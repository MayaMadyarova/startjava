public class GuessNumber {
    Scanner s = new Scanner(System.in);
    Player playerOne = new Player(name1);
    Player playerTwo = new Player(name2);

    int secretNum = 1 + Math.rendom() * 99;

    
    do (s.nextInt() != secretNum && inputNum > min && inputNum <= max) {
        System.out.println("Please, player" + playerOne + "input number which is less then 100 and bigger or equal 1");
        if(inputNum > secretNum) {
            System.out.println("Number " + inputNum + " is bigger than what the computer made up");
            inputNum--;
        } else {
            System.out.println("Number " + inputNum + " is less than what the computer made up");
            inputNum++;
        }
        System.out.println("Please, player" + playerTwo + "input number which is less then 100 and bigger or equal 1");
        if(inputNum > secretNum) {
            System.out.println("Number " + inputNum + " is bigger than what the computer made up");
            inputNum--;
        } else {
            System.out.println("Number " + inputNum + " is less than what the computer made up");
            inputNum++;
        }
    } while (s.nestLine() != secretNum)
    System.out.println("Number " + inputNum + " is what the computer made up. You win!");

}
