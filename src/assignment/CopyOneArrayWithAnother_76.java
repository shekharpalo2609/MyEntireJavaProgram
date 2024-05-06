package assignment;
//Program to copy the value of one array into another and display both arrays

import java.util.Arrays;

public class CopyOneArrayWithAnother_76 {

	public static void main(String[] args) {
		
		String names[] = new String[3];
		
		names[0] = "Ashwin";
		names[1] = "Mukesh";
		names[2] = "Jatin";
		
		String copyName[] = new String[names.length];
		
		for(int i = 0; i < names.length; i++) {
			copyName[i] = names[i];
		}
		System.out.println("Original Array: " + Arrays.toString(names));
		System.out.println("Copied Array: " + Arrays.toString(copyName));
	}

}
