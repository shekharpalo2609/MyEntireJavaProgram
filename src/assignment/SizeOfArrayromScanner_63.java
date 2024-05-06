package assignment;

import java.util.Scanner;
//Create an array for Student the size of array should be coming from the Scanner Class
public class SizeOfArrayromScanner_63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:" );
		int i = sc.nextInt();
		
		int students[] = new int[i];
		System.out.println("size of an array is: "+students.length);
	}

}
