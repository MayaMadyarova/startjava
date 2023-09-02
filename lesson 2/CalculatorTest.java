import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[]args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input the first number: ");
            int a = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input the sign of the mathematical operation: ");
            char sign = scanner.nextLine().charAt(0);
            System.out.println("Input the second number: ");
            int b = scanner.nextInt();
            scanner.nextLine();
            calculator.calculate(a, b, sign);
            System.out.println("Do you want to continue calculation? [yes/no]: ");
        } while (scanner.nextLine().equals("yes"));
    }
}