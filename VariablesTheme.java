public class VariablesTheme {
	
	public static void main(String [] args) {
	System.out.println("1. Primitive data types");
	byte processor = 3; // GHz
	short randomAccessMemory = 8; //Gb
	int readOnlyMemory = 256; //Gb
	int typeOfTheSystem = 64; //bit
	long typeOfWindowsOperatingSystem = 11;
	float screenWidth = 14.0f;  //inch
	double notebookWeigth = 2.191; //kg
   System.out.println("processor, GHz: " + processor + "nrandomAccessMemory, Gb: " + randomAccessMemory + "\nreadOnlyMemory, Gb: " + readOnlyMemory +  "\ntypeOfTheSystem, bit: " + typeOfTheSystem + "\ntypeOfWindowsOperatingSystem: " + typeOfWindowsOperatingSystem + "\nscreenWidth, inch: " + screenWidth + "\nnotebookWeigth, kg: " + notebookWeigth + ".");	

	System.out.println("\n2. Calculation of product cost with discount");
	int pen = 100;
	int book = 200;
	int sum = pen + book; 
	float discount = 0.11f;
	System.out.println("Total products' price without discount: " + sum + "\nDiscount amount: "+ discount + "%" + "\nTotal products' price with discount: " + (sum - sum * discount));
    
    System.out.println("\n3. Output to the screen the word JAVA");
	System.out.println("   " + "J" + "    " + "a" + "  " + "v" + "     " + "v" + "  " + "a" + "   ");
	System.out.println("   " + "J" + "   " + "a" + " " + "a" + "  " + "v" + "   " + "v" + "  " + "a" + " " + "a" + "  ");
	System.out.println("J" + "  " + "J" + "  " + "aaaaa" + "  " + "V" + " " + "V" + "  " + "aaaaa" + " ");
	System.out.println(" " + "JJ" + "  " + "a" + "     " + "a" + "  " + "V" + "  " + "a" + "     " + "a" + " ");
	
	System.out.println("\n4. Output min and max values of integer types");
	byte b = 127;
	short s = 32767;
	int i = 2_147_483_647;
	long l = 9_223_372_036_854_775_807L;
	System.out.println((b--) +  " " + '\n' + (b++) + " " + '\n' + b + " " + '\n');
	System.out.println((s--) +  " " + '\n' + (s++) + " " + '\n' + s + '\n');
	System.out.println((i--) + " " + '\n' +(i++) +" " + '\n' + i + '\n');
	System.out.println((l--) + " " + '\n' + (l++) + " " + '\n' + l);
	
	System.out.println("\n5. Rearrangement of variables' values");
	int num1 = 2;
	int num2 = 5;
	int c;
	System.out.println("\nRearrangement using the third variable");
	System.out.println("\nnumber1 = " + num1 + "\nnumber2 = " + num2);
	c = num2;
	num2 = num1;
	num1 = c;
	System.out.println("\nnumber1 = " + num1 + "\nnumber2 = " + num2);
	System.out.println("\nRearrangement using arithmetic operations");
	System.out.println("\nnumber1 = " + num1 + "\nnumber2 = " + num2);
	c = num1 + num2;
	num1 = c - num1;
	num2 = c - num2;
	System.out.println("\nnumber1 = " + num1 + "\nnumber2 = " + num2);
    System.out.println("\nRearrangement using bit operations");
    System.out.println("\nnumber1 = " + num1 + "\nnumber2 = " + num2);
    c = num1^num2;
    num1 = c^num1;
    num2 = c^num2;
    System.out.println("\nnumber1 = " + num1 + "\nnumber2 = " + num2);
    System.out.println("\n6. Output of characters and their codes");
    char ch1 = '$';
    char ch2 = '*';
    char ch3 = '@';
    char ch4 = '|';
    char ch5 = '~';
    System.out.println('\n' + (int) ch1 + " " + ch1 + '\n' + (int) ch2 + " " + ch2 + '\n' + (int) ch3 + " " +  ch3 + '\n' + (int) ch4 + " " +  ch4 + '\n' + (int) ch5 + " " + ch5);
    System.out.println("\n7. Output to the screen ASCII-art Duck");
    char ch6 = '/';
    char ch7 = '\\';
    char ch8 = '(';
    char ch9 = ')';
    char ch10 = '_';
    System.out.println("    " + ch6 + ch7 + "    ");
    System.out.println("   " + ch6 + "  " + ch7 + "   ");
    System.out.println("  " + ch6 + ch10 + ch8 + " " + ch9 + ch7 + "  ");
    System.out.println(" " + ch6);
    System.out.println("" + ch7);
    System.out.println("" + ch6 + ch10 + ch10 + ch10 + ch10 + ch6 + ch7 + ch10 + ch10 + ch7); 
    System.out.println("\n8. Output the number of hundreds, tens and units to the screen");
    int N = 123;
    int S = N/100 + N%100/10 + N%10;
    int P = N/100 * N%100/10 * N%10; 
    System.out.println("Number " + N + " contains:" + "\nhundreds - "  + N/100 + "\ntens - " + N%100/10 + "\nunits - " + N%10 + "\nSum of its digids = " + S + '\n' + "Product = " + P); 
    System.out.println("\n9. Output of time");
    int time = 86_399;
    int hours = time/60/60;
    int minutes = time/60%60;
    int seconds = time%60;
    System.out.println(hours + ":" + minutes + ":" + seconds);

	}
}