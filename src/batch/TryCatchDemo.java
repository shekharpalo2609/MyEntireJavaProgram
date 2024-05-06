package batch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter age: ");
			int age = sc.nextInt();
		} catch (InputMismatchException e1) {
			System.out.println("Please enter valid data!");
		} catch (NullPointerException e2) {
			System.out.println("Please enter valid data!");
		}
	}
}