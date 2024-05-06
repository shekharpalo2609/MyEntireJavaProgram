package assignment;
//Create a array of datatype boolean of size 3 and takes the value of array using Scanner class
import java.util.Scanner;

public class ArrayInputromScanner_68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean booleanValue[]  = new boolean[3];
		for(int i = 0; i < booleanValue.length; i++) {
			System.out.println("Enter boolean value at index: "+i);
			booleanValue[i] = sc.nextBoolean();
			System.out.println(booleanValue[i]);
			
		}
	}

}
