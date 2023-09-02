public class Calculator {
    int a;
    int b;
    int result = 0;
    char sign;

    void calculate(int a, int b, char sign) {
        switch(sign) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                if(b == 0) {
                    System.out.println("You can't divide by zero");
                    return;
                }
                result = a / b;
                break;
            case '%' :
                result = a % b;
                break;
            case '^' :
                result = 1;
                for(int i = 0; i < b; i++) {
                    result *= a;
                }
                break;
            default:
                System.out.println("You input the wrong sign");
                return;
            }
        System.out.println("Answer is " + result);
    }
}




