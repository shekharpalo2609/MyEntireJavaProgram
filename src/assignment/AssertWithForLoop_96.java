package assignment;

import java.util.Scanner;

//Use the concept of assertion with for loop
public class AssertWithForLoop_96 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name: ");
		String name = sc.next();
		assert name.contains("kh"):"Name doesn't contains the letter 'kh'";
		for(int i = 0; i<= name.length(); i++) {
			System.out.println(name);
		}
		sc.close();
	}
}
