public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Translation pseudocode into Java language");
        boolean male = true;
        if(!male) {
            System.out.println("female");
        } else {
            System.out.println("male");
        }
        
        int age = 20;
        if(age > 18) {
            System.out.println("adult");
        } else {
            System.out.println("child");
        }

        float heigth = 1.75f;
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
            System.out.println(a + " > " + b);
        } else if(a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }

        System.out.println("\n3. Checking the number");
        int whatNumber = 7;
        System.out.print("Number " + whatNumber);
   
        if(whatNumber == 0) {
        } else if(whatNumber > 0) {
            System.out.print(" positive");
        } else {
            System.out.print(" negative");
        }
        if(whatNumber != 0) {
            if(whatNumber % 2 == 0) {
                System.out.print(" even");
            } else {
                System.out.print(" odd");
            }
        }

        System.out.println("\n\n4. Search for identical digits in numbers");
        int num1 = 123;
        int num2 = 223;
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        int tens1 = num1 % 100 / 10;
        int tens2 = num2 % 100 / 10;
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        System.out.println("Initial numbers " + num1 + " and " + num2);
        if(hundreds1 == hundreds2) {
            System.out.print("Equal digit " + hundreds1);
            System.out.println("\nNumbers of ranks = 1");
        }
        if(tens1 == tens2) {
            System.out.print("Equal digit " + tens1);
            System.out.println("\nNumber of rank = 2");
        }
        if(ones1 == ones2) {
            System.out.print("Equal digit " + ones1);
            System.out.println("\nNumber of rank = 3");
        }
        if(hundreds1 != hundreds2 & tens1 != tens2 & ones1 != ones2) {
            System.out.println("No equal digits found");
        }

        System.out.println("\n5. Defining symbol by its code");
        char symbol = '\u0035';
        if(symbol >= '0' & symbol <= '9') {
            System.out.println("Symbol " + symbol + " is a number");
        } else if(symbol >= 'A' & symbol <= 'Z') {
            System.out.println("Symbol " + symbol + " is a capital letter");
        } else if(symbol >='a' & symbol <= 'z') {
            System.out.println("Symbol " + symbol + " is a small letter");
        }  else {
            System.out.println("Symbol " + symbol + " is neither a number no a letter");
        }

        System.out.println("\n6. Calculation of the deposit amount and accrued %");
        int amount = 100_000;
        float interest = 0.05f;
        int interestAmount = (int) (amount * interest);
        if( 100_000 <= amount & amount <= 300_000) {
            interestAmount = (int) (amount * 0.07);
        } else if(amount > 300_000) {
            interestAmount = (int) (amount * 0.10);
        }
        System.out.println("Amount of deposit is " + amount + "\nAccrued % is " + interestAmount
                + "\nTotal amount is " + (amount + interestAmount));
    
        System.out.println("\n7. Defining assessment by subjects");
        int percentHistory = 59;
        int percentProgramming = 92;

        int markHistory = 2;
        if(percentHistory > 91) {
            markHistory = 5;
        } else if(percentHistory > 73) {
            markHistory = 4;
        } else if(percentHistory > 60) {
            markHistory = 3;
        }

        int markProgramming = 2;
        if(percentProgramming > 91) {
            markProgramming = 5;
        } else if(percentProgramming > 73) {
            markProgramming = 4;
        } else if(percentProgramming > 60) {
            markProgramming = 3;
        }

        float averagePercent = (float) (percentHistory + percentProgramming) / 2;
        float averageMark = (float) (markHistory + markProgramming) / 2;
        System.out.println("History - " + markHistory + "\nProgramming - " + markProgramming
                + "\nAverage mark - " + averageMark + "\nAverage Percent - " + averagePercent + "%");

        System.out.println("\n8. Calculation of annual profit");
        int revenue = 14000;
        int rent = 5000;
        int productionCost = 9000;
        int profit = revenue - rent - productionCost;
        if(profit == 0) {
            System.out.println("Profit for the year: " + profit * 12);
        } else if(profit > 0) {
            System.out.println("Profit for the year: " + "+" + profit * 12);
        } else if(profit < 0) {
            System.out.println("Profit for the year: " + profit * 12);
        }
    }
}