package assignment;

import java.util.Arrays;
//Program to copy the value of one array into another and display both arrays in which one array should print in reverse order.
public class ReverseCopiedArray_80 {

	public static void main(String[] args) {
		
String names[] = new String[3];
		
		names[0] = "Ashwin";
		names[1] = "Mukesh";
		names[2] = "Jatin";
		
		String copyName[] = new String[names.length];
		
		for(int i = names.length-1; i >= 0; i--) {
			copyName[i] = names[i];
		}
		System.out.println("Original Array: " + Arrays.toString(names));
		System.out.println("Copied Array: " + Arrays.toString(copyName));
		for(int i=copyName.length-1;i>=0;i--)
		{
			
            System.out.print(copyName[i] + " ");  

		}
	}

}