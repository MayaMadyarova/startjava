public class Calculator {
    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    void calculate() {
        int result = 0;
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
        System.out.println("The answer is " + result);
    }
}