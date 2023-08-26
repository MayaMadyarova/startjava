public class GessNumber {
    public static void main(String[] args) {
    int pickedNum = 50;
    int max = 100;
    int min = 0;
    System.out.println("Please, input number which is less then 100 and bigger or equal 1");
    int inputNum = 45;
    while (inputNum != pickedNum & inputNum <= max & inputNum > min) {
        if(inputNum > pickedNum) {
            System.out.println("Number " + inputNum + " is bigger than what the computer made up");
            inputNum -= 1;
        } else {
            System.out.println("Number " + inputNum + " is less than what the computer made up");
            inputNum += 1;
        }
    }
    System.out.println("Number " + inputNum + " is what the computer made up. You win!");
    }
}