import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[]args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        Boolean bool = true;
        String str;

        do {
            System.out.println("Input the first number: ");
            calculator.setA(scanner.nextInt());
            int a = calculator.getA();
            scanner.nextLine();
            System.out.println("Input the sign of the mathematical operation: ");
            calculator.setSign(scanner.nextLine().charAt(0));
            char sign = calculator.getSign();
            System.out.println("Input the second number: ");
            calculator.setB(scanner.nextInt());
            int b = calculator.getB();
            scanner.nextLine();
            calculator.calculate(a, b, sign);
            do {System.out.println("Do you want to continue calculation? [yes/no]: ");
                str = scanner.nextLine();
            } while (bool != (str.equals("no") || str.equals("yes")));
        } while (str.equals("yes"));
    }
}