package assignment;

import java.util.Scanner;

//Create a array of datatype int of size 3 and takes the value of array using Scanner class
public class ArrayInputromScanner_64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String studentName[]  = new String[3];
		for(int i = 0; i <studentName.length; i++) {
			System.out.println("Enter student name at index: "+i);
			studentName[i] = sc.nextLine();
			System.out.println(studentName[i]);
			
		}
	}

}
