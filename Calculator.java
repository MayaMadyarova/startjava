public class Calculator {

    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        char sign = '*';
        int result;
        if(sign == '+') {
            result = a + b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if(sign == '-') {
            result = a - b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if(sign == '*') {
            result = a * b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if(sign == '/') {
            if( b == 0) {
                System.out.println("You can't divide by zero");
            } else {
            result = a / b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
            }
        } else if(sign == '%') {
            result = a % b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if(sign == '^') {
            if(b == 0) {
                result = 1;
            } else {
                result = a;
                for(int i = 1; i < b; i++) {
                    result = result * a;
                }
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}