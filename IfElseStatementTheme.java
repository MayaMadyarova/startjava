public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Translation pseudocode into Java language");
        boolean male = true;
        int age = 20;
        float heigth = 1.75f;

        if(!male) {
            System.out.println("female");
        } else {
            System.out.println("male");
        }

        if(age > 18) {
            System.out.println("adult");
        } else {
            System.out.println("child");
        }

        if(heigth < 1.8f) {
            System.out.println("not tall");
        } else {
            System.out.println("tall");
        }

        char firstLetterName = "Mickle".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("First letter is M");
        } else if(firstLetterName == 'I') {
            System.out.println("First letter is I");
        } else {
            System.out.println("neither M no I is present");
        }

        System.out.println("\n2. Finding the maximum value");
        int a = 300;
        int b = 300;
        if(a > b) {
            System.out.println("a > b");
        } else if(a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("\n3. Checking the number");
        int c = 0;
        if(c == 0) {
            System.out.println("Number " + c + " is null");
        } else if (c < 0) {
            if(c % 2 != 0) {
                System.out.println("Number " + c + " is negative and odd");
            } else {
                System.out.println("Number " + c + " is negative and even");
            }
        } else {
            if(c % 2 != 0) {
                System.out.println("Number " + c + " is positive and odd");
            } else {
                System.out.println("Number " + c + " is positive and even");
            }
        }
        System.out.println("\n4. Search for identical digits in numbers");
        int num1 = 123;
        int num2 = 223;
        int firstNum1 = num1 / 100;
        int firstNum2 = num2 / 100;
        int secondNum1 = num1 % 100 / 10;
        int secondNum2 = num2 % 100 / 10;
        int thirdNum1 = num1 % 10;
        int thirdNum2 = num2 % 10;
        System.out.println("Initial numbers " + num1 + " and " + num2);
        if(firstNum1 != firstNum2 & secondNum1 != secondNum2 & thirdNum1 != thirdNum2) {
            System.out.println("No identical digits in numbers'ranks");
        } else if(firstNum1 == firstNum2 & secondNum1 == secondNum2 & thirdNum1 == thirdNum2) {
            System.out.println("Equal digits " + firstNum1 + ", " + secondNum1 + ", " + thirdNum1
                    + "\nNumbers of ranks = 1, 2, 3");
        } else if (firstNum1 == firstNum2 & secondNum1 == secondNum2) {
            System.out.println("Equal digits " + firstNum1 + ", " + secondNum1
                    + "\nNumbers of ranks = 1, 2");
        } else if(secondNum1 == secondNum2 & thirdNum1 == thirdNum2) {
            System.out.println("Equal digits " + secondNum1 + ", " + thirdNum1
                    + "\nNumbers of ranks = 2, 3");
        } else if(firstNum1 == firstNum2 & thirdNum1 == thirdNum2) {
            System.out.println("Equal digits " + firstNum1 + ", " + thirdNum1
                    + "\nNumbers of ranks = 1, 3"); 
        } else if(firstNum1 == firstNum2) {
            System.out.println("Equal digits " + firstNum1 + "\nNumber of rank = 1");
        } else if(secondNum1 == secondNum2) {
            System.out.println("Equal digits " + secondNum1 + "\nNumber of rank = 2");  
        } else if(thirdNum1 == thirdNum2) {
        System.out.println("Equal digits " + thirdNum1 + "\nNumber of rank = 3");    
        }
    
        System.out.println("\n5. Defining symbol by its code");
        char ch1 = '\u0035';
        if(ch1 >= '0' & ch1 <= '9') {
            System.out.println("Symbol " + ch1 + " is a number");
        } else if(ch1 >= 'A' & ch1 <= 'Z') {
            System.out.println("Symbol " + ch1 + " is a capital letter");
        } else if(ch1 >='a' & ch1 <= 'z') {
            System.out.println("Symbol " + ch1 + " is a small letter");
        }  else {
            System.out.println("Symbol " + ch1 + " is neither a number no a letter");
        }

        System.out.println("\n6. Calculation of the deposit amount and accrued %");
        int amount = 301_000;
        int interest;
        System.out.println("Amount of deposit is " + amount);
        if(amount < 100_000) {
            interest = (int) (amount * 0.05);
            System.out.println("Accrued % is " + interest + "\nTotal amount is "
                    + (amount+interest));
        } else if( 100_000 <= amount & amount <= 300_000) {
            interest = (int) (amount * 0.07);
            System.out.println("Accrued % is " + interest + "\nTotal amount is "
                    + (amount+interest));
        } else if(amount > 300_000) {
            interest = (int) (amount * 0.10);
            System.out.println("Accrued % is " + interest + "\nTotal amount is "
                    + (amount+interest));
        }
    
        System.out.println("\n7. Defining assessment by subjects");
        int ScoreHistory = 59;
        int ScoreProgramming = 92;
        int markHistory = 0;
        int markProgramming = 0;
        if(ScoreHistory <= 60) {
            markHistory = 2;
        } else if(ScoreHistory > 91) {
            markHistory = 5;
        } else if(ScoreHistory > 73) {
            markHistory = 4;
        } else if(ScoreHistory > 60) {
            markHistory = 3;
        }

        if(ScoreProgramming <= 60) {
            markProgramming = 2;
        } else if(ScoreProgramming > 91) {
            markProgramming = 5;
        } else if(ScoreProgramming > 73) {
            markProgramming = 4;
        } else if(ScoreProgramming > 60) {
            markProgramming = 3;
        }

        float averageScore = (float) (ScoreHistory + ScoreProgramming)/2;
        float averageMark = (float) (markHistory + markProgramming)/2;
        System.out.println("History - " + markHistory + "\nProgramming - " + markProgramming
                + "\nAverage mark - " + averageMark + "\nAverage Score - " + averageScore + "%");

        System.out.println("\n8. Calculation of annual profit");
        int revenue = 13000;
        int rent = 5000;
        int productionCost = 9000;
        int profit = revenue - rent - productionCost;
        if(profit > 0) {
            System.out.println("Profit for the year: " + "+" + profit);
        } else if(profit < 0) {
            System.out.println("Profit for the year: " + profit);
        }
    }
}