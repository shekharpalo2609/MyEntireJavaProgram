package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

//Try , catch and finally keyword usage in one program

public class TryCatchFinally_99 {

	static int age;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the age: ");
		
		try 
		{
			age=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter valid data for age!");
		}
		finally
		{
			System.out.println("This is finally block");
			sc.close();
		}
	}

}