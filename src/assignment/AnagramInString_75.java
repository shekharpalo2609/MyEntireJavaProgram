package assignment;

import java.util.Arrays;

//Find out if 2 given strings are anagram of each other

public class AnagramInString_75 {
	public static void main(String[] args) {

		String input1 = "state";
		String input2 = "taste";

		char[] ch1 = input1.toCharArray();
		char[] ch2 = input2.toCharArray();
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		System.out.println();
		System.out.println("After sorting:");
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));

		boolean answer = Arrays.equals(ch1, ch2);
		if (answer == true) {
			System.out.println("Given 2 strings are anagram!");
		} else {
			System.out.println("Given 2 strings are not anagram!");
		}

	}

}
