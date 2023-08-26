public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Calculation the sum of even and odd numbers");
        int a = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(a % 2 == 0) {
                sumEven = a + sumEven;
            } else {
                sumOdd = a + sumOdd;
            }
            a++;
        } while (a <= 21);
        System.out.println("In the line [-10; 21] the sum of even numbers = " + sumEven
                + ", and odd numbers = " + sumOdd);

        System.out.println("\n2. Output of numbers in the descending order.");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max;
        int min;
        if (num1 > num2 & num1 > num3) {
            max = num1;
        } else if (num2 > num1 & num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        if (num1 < num2 & num1 < num3) {
            min = num1;
        } else if (num2 < num1 & num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        System. out.println(min + ", " + max);
        
        for (int i = max - 1; i > min; i--) {
        System.out.printf("%2d", i);
        }

        System.out.println("\n\n3. Output of a reverse number and the sum of its digits");
        int num4 = 1234;
        int sum = 0;
        while(num4 > 0) {
            System.out.print(num4 % 10);
            sum += num4 % 10;
            num4 /= 10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n4. Output of numbers in several lines");
        int num5 = 1;
        int num6 = 24;
        int count = 0; 
        for (int i = num5; i < num6; i = i + 2) {
        System.out.printf("%4d", i);
        count++;
        if (count % 5 == 0) {
            System.out.println(" ");
        }         
        } 
        if(count % 5 != 0) {
            for (int j = (5 - count % 5); j > 0; j--) {
            System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Checking number of twos on parity");
        int num7 = 3_242_592;
        int temp = num7;
        int count1 = 0;
        while(temp > 0) {
            if(temp % 10 == 2){
                count1++;
            }
            temp /= 10;
        }

        if(count1 % 2 != 0) {
            System.out.println("In " + num7 + " odd number of twos - " + count1);
        } else {
            System.out.println("In " + num7 + " even number of twos - " + count1);
        }

        System.out.println("\n6. Displaying geometric shapes");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }    
            System.out.println("");
        }
        System.out.println(" ");

        int i = 5;
        int j = 0;
        while(i > 0 )  {
            while(j < i) {
                System.out.print("#");
                j++;
            }
            System.out.println(" ");
            i--;
            j = 0;
        }
        System.out.println(" ");

        j = 0;
        i = 4;
        do {
            System.out.println("$");
            do {
                System.out.print("$");
                j++;
            } while(j == 2);
            i--;
        } while(i > 0);
        
        System.out.println("\n\n7. Displaying ASCII-symbols");
        for(i = 1; i <= 48; i = i + 2) {
            System.out.println(i + " " + (char) i); 
        }
        System.out.println("");
        
        for(i = 98; i <= 122; i = i + 2) {
            System.out.println(i + " " + (char) i);
       }

        System.out.println("\n8. Checking if the number is a polindrome");
        int numP = 1234321;
        int count2 = 1;
        int temp0 = numP;
        while(temp0 >= 10) {
            temp0 /= 10;
            count2++;
        }
        int temp1 = numP;
        int sumrev = 0;
        for(i = 0; i < count2; i++) {
            int num8 = temp1 % 10;
            for(j = count2 - 1; j > i; j--) {
                num8 *= 10;
            }
            sumrev += num8;
            temp1 /= 10;
        }
        if(sumrev == numP) {
            System.out.println("Number " + numP + " is a polindrome" );
        } else {
            System.out.println("Number " + numP + " is not a polindrome" );
        }

        System.out.println("\n9. Checking if the number is happy");
        int numHappy = 456654;
        int sumFirstThree = 0; 
        int sumSecondThree = 0;
        int tempH = numHappy;
        for(i = 0; i < 3; i++) {
            int firstThreeDigits = numHappy % 10;
            sumFirstThree += firstThreeDigits;
            numHappy /= 10; 
        } 
        for(i = 0; i < 3; i++) {
        int secondThreeDigits = numHappy % 10;
        sumSecondThree += secondThreeDigits;
        numHappy /= 10;
        }
        if(sumFirstThree == sumSecondThree) {
        System.out.println("Number " + tempH + " is a happy\nSum of ABC = " + sumFirstThree
                + " and sum of DEF = " + sumSecondThree);
        }
        System.out.println("\n10. Displaying the Pythagorean multiplication table");
        char underScore = 95;
        char verticalBar = 124; 
        for(i = 1; i < 10; i++) {
            for(j = 1; j < 10; j++) {
                if(i == 1 & j == 1) {
                    System.out.print("   ");
                    System.out.print(underScore);
                    System.out.print(verticalBar);
                } else if(j == 1) {
                    System.out.printf("%4d", i * j, " ");
                    System.out.print(verticalBar);
                } else if(i == 1) {
                    System.out.print(underScore);
                    System.out.print(underScore);
                    System.out.printf("%2d", i * j, " ");
                } else {
                    System.out.printf("%4d", i * j, " ");
                }
            }
            System.out.println(" ");
        }
    }
}
