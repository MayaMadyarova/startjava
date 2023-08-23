public class VariablesTheme {
	
	public static void main(String [] args) {
		System.out.println("1. Primitive data types");
		byte processor = 3; // GHz
		short ram = 8; //Gb
		int rom = 256; //Gb
		short typeSystem = 64; //bit
		long windowsOS = 11L;
		float screenWidth = 14.0f;  //inch
		double notebookWeigth = 2.191; //kg
		char dataDisk = 'D';
		boolean linux = false; 
		boolean touchInput = false; 
   		System.out.println("processor, GHz: " + processor + "\nram, Gb: " + ram + "\nrom, Gb: " + rom  +  "\ntypeSystem, bit: " 
   		   + typeSystem + "\nwindowsOS: " + windowsOS + "\nscreenWidth, inch: " + screenWidth + "\nnotebookWeigth, kg: " 
   		    + notebookWeigth + "\ndataDisk: " + dataDisk + "\nlinux: " + linux + "\ntouchInput: " + touchInput + ".");	

		System.out.println("\n2. Calculation of product cost with discount");
		int penPrice = 100;
		int bookPrice = 200;
		int sum = penPrice + bookPrice; 
		float discount = 0.11f;
		System.out.println("Total products' price without discount: " + sum + "\nDiscount amount: "+ discount + "%" 
		    + "\nTotal products' price with discount: " + (sum - sum * discount));
    
    	System.out.println("\n3. Output to the screen the word JAVA");
		System.out.println("   J    a  v     v  a   ");
		System.out.println("   J   a a  v   v  a a  ");
		System.out.println("J  J  aaaaa  V V  aaaaa ");
		System.out.println(" JJ  a     a  V  a     a");
	
		System.out.println("\n4. Output min and max values of integer types");
		byte maxByte = 127;
		short maxShort = 32767;
		int maxInt = 2_147_483_647;
		long maxLong = 9_223_372_036_854_775_807L;
		System.out.println((maxByte++) +  " \n" + (maxByte--) + " \n" + maxByte + " \n");
		System.out.println((maxShort++) +  " \n" + (maxShort--) + " \n" + maxShort + '\n');
		System.out.println((maxInt++) + " \n" + (maxInt--) +" \n" + maxInt + '\n');
		System.out.println((maxLong++) + " \n" + (maxLong--) + " \n" + maxLong);
	
		System.out.println("\n5. Rearrangement of variables' values");
		int a = 2;
		int b = 5;
		int temp;
		System.out.println("\nRearrangement using the third variable");
		System.out.println("\na = " + a + "\nb = " + b);
		temp = b;
		b = a;
		a = temp;
		System.out.println("\na = " + a + "\nb = " + b);
		System.out.println("\nRearrangement using arithmetic operations");
		System.out.println("\na = " + a + "\nb = " + b);
		a = a + b;
		b = a - b;
		a = a - b; 
		System.out.println("\na = " + a + "\nb = " + b);
    	System.out.println("\nRearrangement using bit operations");
    	System.out.println("\na = " + a + "\nb = " + b);
    	a = a^b;
    	b = b^a;
    	a = a^b;
    	System.out.println("\na = " + a + "\nb = " + b);

    	System.out.println("\n6. Output of characters and their codes");
    	char dollar = '$';
    	char asterisk = '*';
    	char atSign = '@';
    	char verticalBar = '|';
    	char tilde = '~';
    	System.out.println('\n' + (int) dollar + " " + dollar + '\n' + (int) asterisk + " " + asterisk + '\n' 
    	    + (int) atSign + " " +  atSign + '\n' + (int) verticalBar + " " +  verticalBar + '\n' + (int) tilde + " " + tilde);

    	System.out.println("\n7. Output to the screen ASCII-art Duck");
    	char slash = '/';
    	char backSlash = '\\';
    	char leftParenthesis = '(';
    	char rightParenthesis = ')';
    	char underScore = '_';
    	System.out.println("    " + slash + backSlash + "    ");
    	System.out.println("   " + slash + "  " + backSlash + "   ");
    	System.out.println("  " + slash + underScore + leftParenthesis + " " + rightParenthesis + underScore + "  ");
    	System.out.println(" " + slash);
    	System.out.println("" + backSlash);
    	System.out.println("" + slash + underScore + underScore + underScore + underScore + backSlash + slash + underScore + underScore + underScore); 

    	System.out.println("\n8. Output the number of hundreds, tens and units to the screen");
    	int num = 123;
    	int hundreds = num / 100;
    	int tens = num % 100 / 10;
    	int units = num % 10; 
    	System.out.println("Number " + num + " contains:" + "\nhundreds - "  + hundreds + "\ntens - " + tens + "\nunits - " + units 
    		+ "\nSum of its digids = " + (hundreds + tens + units) + '\n' + "Product = " + (hundreds * tens * units)); 

    	System.out.println("\n9. Output of time");
    	int time = 86_399;
    	int hours = time / 60 / 60;
    	int minutes = time / 60 % 60;
    	int seconds = time % 60;
    	System.out.println(hours + ":" + minutes + ":" + seconds);

	}
}