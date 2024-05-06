package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

//Create an String array of size size 4 at the run time. At runtime, give size as 3, 4 and manish. Handle all the exceptions.

public class ExceptionHandlingWithScanner_98 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of an array: ");
		try {
			int size = sc.nextInt();
			
			String input[] = new String[size];
			
			input[0] = "Ram";
			input[1] = "Sita";
			input[2] = "Laxman";
			input[3] = "Hanuman";
			
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array size is small!");
		}
		catch (InputMismatchException ie) {
			System.out.println("Please pass int datatype for the array size!");
		}
		sc.close();
	}

}
