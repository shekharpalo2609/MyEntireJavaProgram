package assignment;

import java.util.Arrays;

//Program to split the input string using split function

public class SplitMethod_86 {

	public static void main(String[] args) {
		
		String input = "This is JAVA language";
		
		String arr[] = input.split(" ");
		System.out.println(Arrays.toString(arr));
	}

}
