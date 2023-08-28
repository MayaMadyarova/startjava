public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Calculation the sum of even and odd numbers");
        int numInLine = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(numInLine % 2 == 0) {
                sumEven += numInLine;
            } else {
                sumOdd += numInLine;
            }
            numInLine++;
        } while (numInLine <= 21);
        System.out.println("In the line [-10; 21] the sum of even numbers = " + sumEven
                + ", and odd numbers = " + sumOdd);

        System.out.println("\n2. Output of numbers in the descending order.");
        int max = 1;
        int copyMax = max;
        int num = 5;
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
        if(copyMax < min) {
            min = copyMax;
        }

        System. out.println(min + ", " + max);
        for (int i = max - 1; i > min; i--) {
            System.out.printf("%2d, ", i);
        }

        System.out.println("\n\n3. Output of a reverse number and the sum of its digits");
        int someNum = 1234;
        int sum = 0;
        while(someNum > 0) {
            System.out.print(someNum % 10);
            sum += someNum % 10;
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
        int num7 = 3_242_592;
        int copyNum7 = num7;
        int countTwos = 0;
        while(copyNum7 > 0) {
            if(copyNum7 % 10 == 2) {
                countTwos++;
            }
            copyNum7 /= 10;
        }

        if(countTwos % 2 != 0) {
            System.out.println("In " + num7 + " odd number of twos - " + countTwos);
        } else {
            System.out.println("In " + num7 + " even number of twos - " + countTwos);
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

        int dollar = 0;
        int dollar2 = 4;
        do {
            System.out.println("$");
            do {
                System.out.print("$");
                dollar++;
            } while(dollar == 2);
            dollar2--;
        } while(dollar2 > 0);
        
        System.out.println("\n\n7. Displaying ASCII-symbols");
        for(int i = 1; i <= 48; i += 2) {
            System.out.printf("%3d      %c      %s\n", i, (char) i, Character.getName(i)); 
        }
        for(int i = 98; i <= 122; i += 2) {
            System.out.printf("%3d      %c      %s\n", i, (char) i, Character.getName(i));
       }

        System.out.println("\n8. Checking if the number is a polindrome");
        int numP = 1234327;
        int copyNumP = numP;
        int countRank = 0;
        while(copyNumP >= 10) {
            copyNumP /= 10;
            countRank++;
        }
        copyNumP = numP;
        int sumReverse = 0;
        for(int i = 0; i <= countRank; i++) {
            int numNew = copyNumP % 10;
            for(int j = countRank; j > i; j--) {
                numNew *= 10;
            }
            sumReverse += numNew;
            copyNumP /= 10;
        }
        if(sumReverse == numP) {
            System.out.println("Number " + numP + " is a polindrome" );
        } else {
            System.out.println("Number " + numP + " is not a polindrome" );
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
