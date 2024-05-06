package assignment;

import java.util.Scanner;

public class ScannerMethods_12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		  System.out.print("Enter boolean value: "); boolean bool = sc.nextBoolean();
		  System.out.println("Entered boolean value is: "+ bool);
		  
		  System.out.print("Enter byte value: "); byte b = sc.nextByte();
		  System.out.println("Entered byte value is: "+ b);
		  
		  
		  System.out.print("Enter short value: "); short s = sc.nextShort();
		  System.out.println("Entered short value is: "+ s);
		  
		  System.out.print("Enter integer value: "); int i = sc.nextInt();
		  System.out.println("Entered integer value is: "+i);
		  
		  System.out.print("Enter long value: "); long l = sc.nextLong();
		  System.out.println("Entered long value is: "+l);
		  
		  System.out.print("Enter double value: "); double d = sc.nextDouble();
		  System.out.println("Entered double value is: "+d);
		 		  
		  System.out.print("Enter float value: "); float f = sc.nextFloat();
		  System.out.println("Entered float value is: "+f);
		  
		  
			/*
			 * System.out.print("Enter char value: "); char ch = sc.next();
			 * System.out.println("Entered char value is: "+ch);
			 */ 
		 

		System.out.print("Enter String value: ");
		String str = sc.next();
		System.out.println("Entered String value is: " + str);

	}
}