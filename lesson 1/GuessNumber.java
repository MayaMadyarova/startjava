public class GuessNumber {
    public static void main(String[] args) {
        int secretNum = 60;
        int max = 100;
        int min = 0;
        System.out.println("Please, input number which is less then 100 and bigger or equal 1");
        int inputNum = 45;
        while (inputNum != secretNum && inputNum > min && inputNum <= max) {
            if(inputNum > secretNum) {
                System.out.println("Number " + inputNum + " is bigger than what the computer made up");
                inputNum--;
            } else {
                System.out.println("Number " + inputNum + " is less than what the computer made up");
                inputNum++;
            }
        }
        System.out.println("Number " + inputNum + " is what the computer made up. You win!");
    }
}