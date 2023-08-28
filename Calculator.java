public class Calculator {

    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        char sign = '^';
        int result = 0;
        if(sign == '+') {
            result = a + b;
        } else if(sign == '-') {
            result = a - b;
        } else if(sign == '*') {
            result = a * b;
        } else if(sign == '/') {
            if(b == 0) {
                System.out.println("You can't divide by zero");
            }
            result = a / b;
        } else if(sign == '%') {
            result = a % b;
        } else if(sign == '^') {
            if(b == 0) {
                result = 1;
            }
            result = 1;
            for(int i = 0; i < b; i++) {
                result *= a;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}