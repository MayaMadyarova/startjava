public class IfElseStatementTheme {
	
    public static void main(String[] args) {
    System.out.println("1. Translation pseudocode into Java language" + '\n');
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

    char firstLetterInName = "Mickle".charAt(0);
    if(firstLetterInName == 'M') {
	System.out.println("First letter is M");
    } else if(firstLetterInName == 'I') {
	System.out.println("First letter is I");
    } else {
	System.out.println("neither M no I is present");
    }

    System.out.println('\n' + "2. Finding the maximum value" + '\n');
    int a = 300;
    int b = 4;
    if(a > b) {
    System.out.println("a > b");  
    } else if(a < b) {
    System.out.println("a < b");
    } else {
    System.out.println("a = b");
    }

    System.out.println('\n' + "3. Checking the number" + '\n');
    int c = -560;
    if(c < 0) {
        if(c%2 !=0) {
    System.out.println("Number " + c + " is negative and odd");
    } else {
    System.out.println("Number " + c + " is negative and even");    
    } 
    } else if(c > 0) {
    if(c%2 != 0) {
    System.out.println("Number " + c + " is positive and odd");
    } else {
    System.out.println("Number " + c + " is positive and even");
    } 
    }

    System.out.println('\n' + "4. Search for identical digits in numbers");
    int d = 123;
    int e = 223;
    if(d/100 != e/100 & d%100/10 != e%100/10 & d%100%10 != e%100%10) {
        System.out.println("No identical digits in numbers'ranks");
    } else if(d/100 == e/100 & d%100/10 == e%100/10 & d%100%10 == e%100%10) {
    System.out.println("Initial numbers " + d + " and " + e + '\n' + "Equal digits " + d/100 + " and " + e/100 + ", " + d%100/10 + " and " + e%100/10 + ", " + d%100%10 + " and " + e%100%10 + '\n' + "Numbers of digits = 1, 2, 3");
    } else if (d/100 == e/100 & d%100/10 == e%100/10) {
    System.out.println("Initial numbers " + d + " and " + e + '\n' + "Equal digits " + d/100 + " and " + e/100 + ", " + d%100/10 + " and " + e%100/10 + "Numbers of ranks = 1, 2");
    } else if(d%100/10 == e%100/10 & d%100%10 == e%100%10) {
    System.out.println("Initial numbers " + d + " and " + e + '\n' + "Equal digits " + d%100/10 + " and " + e%100/10 + ", " + d%100%10 + " and " + e%100%10 + '\n' + "Numbers of ranks = 2, 3");
    } else if(d/100 == e/100 & d%100%10 == e%100%10) {
    System.out.println("Initial numbers " + d + " and " + e + '\n' + "Equal digits " + d/100 + " and " + e/100 + ", " + d%100%10 + " and " + e%100%10 + '\n' + "Numbers of ranks = 1, 3"); 
    } else if(d/100 == e/100) {
    System.out.println("Initial numbers " + d + " and " + e + '\n' + "Equal digits " + d/100 + " and " + e/100 + '\n' + "Number of rank = 1");
    } else if(d%100/10 == e%100/10) {
    System.out.println("Initial numbers " + d + " and " + e + '\n' + "Equal digits " + d%100/10 + " and " + e%100/10 + '\n' + "Number of rank = 2");  
    } else if(d%100%10 == e%100%10) {
    System.out.println("Initial numbers " + d + " and " + e + '\n' + "Equal digits " + d%100%10 + " and " + e%100%10 + '\n' + "Number of rank = 3");    
    }
    
    System.out.println('\n' + "5. Defining symbol by its code");
    char ch1 = '\u0034';
    if(ch1 >= '0' && ch1 <= '9') {
    System.out.println('\n' + "Symbol " + ch1 + " is a number");
    } else if(ch1 >= 'A' && ch1 <= 'Z') {
    System.out.println('\n' + "Symbol " + ch1 + " is a capital letter");
    } else if(ch1 >='a' && ch1 <= 'z') {
    System.out.println('\n' + "Symbol " + ch1 + " is a small letter");
    }  else {
    System.out.println('\n' + "Symbol " + ch1 + " is neither a number no a letter");
    }
    System.out.println('\n' + "6. Calculation of the deposit amount and accrued %");
    int amount = 301_000;
    int interest;
    if(amount < 100_000) {
    interest = (int) (amount * 0.05);
    System.out.println("Amount of deposit is " + amount + ", accrued % is " + interest + ", total amount is " + (amount+interest));
    } else if( 100_000 <= amount & amount <= 300_000) {
    interest = (int) (amount * 0.07);
    System.out.println("Amount of deposit is " + amount + ", accrued % is " + interest + ", total amount is " + (amount+interest));
    } else if(amount > 300_000) {
    interest = (int) (amount * 0.10);
    System.out.println("Amount of deposit is " + amount + ", accrued % is " + interest + ", total amount is " + (amount+interest));
    }
    
    System.out.println('\n' + "7. Defining assessement by subjects");
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
    System.out.println("History - " + markHistory + '\n' + "Programming - " + markProgramming + '\n' + "Average mark - " + averageMark + '\n' +"Average Score - " + averageScore);

    System.out.println('\n' + "8. Calculation of annual profit");
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