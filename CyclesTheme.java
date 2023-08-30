public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Calculation the sum of even and odd numbers");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("In the line [-10; 21] the sum of even numbers = " + sumEven
                + ", and odd numbers = " + sumOdd);

        System.out.println("\n2. Output of numbers in the descending order.");
        int num = 5;
        int num2 = 1;
        int max = num2;
        int min = 19;
        if(num > max) {
            max = num;
        }
        if(min > max) {
            max = min;
        }
        if(num < min) {
            min = num;
        }
        if(max < min) {
            min = num2;
        }

        System. out.println(min + ", " + max);
        for (int i = max - 1; i > min; i--) {
            System.out.printf("%2d, ", i);
        }

        System.out.println("\n\n3. Output of a reverse number and the sum of its digits");
        int someNum = 1234;
        int sum = 0;
        while(someNum > 0) {
            int digit = someNum % 10;
            System.out.print(digit);
            sum += digit;
            someNum /= 10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n4. Output of numbers in several lines");
        int startPoint = 1;
        int endPoint = 24;
        int count = 0;
        for (int i = startPoint; i < endPoint; i += 2) {
            System.out.printf("%4d", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }         
        } 
        if(count % 5 != 0) {
            for (int j = (5 - count % 5); j > 0; j--) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Checking number of twos on parity");
        int numWithTwos = 3_242_592;
        int copynumWithTwos = numWithTwos;
        int countTwos = 0;
        while(copynumWithTwos > 0) {
            if(copynumWithTwos % 10 == 2) {
                countTwos++;
            }
            copynumWithTwos /= 10;
        }

        if(countTwos % 2 != 0) {
            System.out.println("In " + numWithTwos + " odd number of twos - " + countTwos);
        } else {
            System.out.println("In " + numWithTwos + " even number of twos - " + countTwos);
        }

        System.out.println("\n6. Displaying geometric shapes");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }    
            System.out.println();
        }
        System.out.println();

        int lines = 5;
        int rows = 0;
        while(lines > 0) {
            while(rows < lines) {
                System.out.print("#");
                rows++;
            }
            System.out.println();
            lines--;
            rows = 0;
        }
        System.out.println();

        lines = 0;
        rows = 4;
        do {
            System.out.println("$");
            do {
                System.out.print("$");
                lines++;
            } while(lines == 2);
            rows--;
        } while(rows > 0);
        
        System.out.println("\n\n7. Displaying ASCII-symbols");
            System.out.printf("%s%17s%29s\n", "Decimal", "HTML Name", "Charater");
        for(int i = 1; i <= 48; i += 2) {
            System.out.printf("%3d%17c%37s\n", i, i, Character.getName(i));
        }
        for(int i = 98; i <= 122; i += 2) {
            System.out.printf("%3d%17c%37s\n", i, i, Character.getName(i));
       }

        System.out.println("\n8. Checking if the number is a palindrome");
        int palindromeOrNot = 5234325;
        int copy = palindromeOrNot;
        int reverseNum = 0;
        while(copy > 0) {
           int digit = copy % 10;
           reverseNum *= 10;
           reverseNum += digit;
           copy /= 10;
        }
        if(reverseNum == palindromeOrNot) {
            System.out.println("Number " + palindromeOrNot + " is a palindrome" );
        } else {
            System.out.println("Number " + palindromeOrNot + " is not a palindrome" );
        }

        System.out.println("\n9. Checking if the number is happy");
        int numHappy = 456654;
        int sumFirstThree = 0; 
        int sumSecondThree = 0;
        int copyNumHappy = numHappy;
        for(int i = 0; i < 3; i++) {
            int firstThreeDigits = numHappy % 10;
            sumFirstThree += firstThreeDigits;
            numHappy /= 10; 
        } 
        for(int i = 0; i < 3; i++) {
        int secondThreeDigits = numHappy % 10;
        sumSecondThree += secondThreeDigits;
        numHappy /= 10;
        }
        if(sumFirstThree == sumSecondThree) {
            System.out.println("Number " + copyNumHappy + " is a happy\nSum of ABC = " + sumFirstThree
                    + " and sum of DEF = " + sumSecondThree);
        }
        System.out.println("\n10. Displaying the Pythagorean multiplication table");
        char underScore = 95;
        char verticalBar = 124; 
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                if(i == 1 && j == 1) {
                    System.out.print(underScore);
                    System.out.print(verticalBar);
                } else if(j == 1) {
                    System.out.printf("%d", i * j);
                    System.out.print(verticalBar);
                } else if(i == 1) {
                    System.out.print(underScore);
                    System.out.print(underScore);
                    System.out.printf("%2d", i * j);
                } else {
                    System.out.printf("%4d", i * j);
                }
            }
            System.out.println();
        }
    }
}
