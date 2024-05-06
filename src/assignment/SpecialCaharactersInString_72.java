package assignment;

import java.util.Arrays;

//In  a String 'Shekhar @123 Palo!' find out the number of special characters involved
public class SpecialCaharactersInString_72 {

	static int noOfAlphabets = 0;
	static int noOfDigits = 0;
	static int noOfSpaces = 0;

	public static void main(String[] args) {
		String name = "Shekhar @123 Palo!";
		char[] ch = name.toCharArray();
		System.out.println(Arrays.toString(ch));
		for (int i = 0; i < ch.length; i++) {
			boolean answer1 = Character.isAlphabetic(ch[i]);
			boolean answer2 = Character.isDigit(ch[i]);
			boolean answer3 = Character.isSpaceChar(ch[i]);
			if (answer1 == true) {
				noOfAlphabets++;
			} else if (answer2 == true) {
				noOfDigits++;
			} else if (answer3 == true) {
				noOfSpaces++;
			}
		}
		System.out.println("Alphabets: " + noOfAlphabets);
		System.out.println("Digits: " + noOfDigits);
		System.out.println("Spaces: " + noOfSpaces);

		int totalLength = ch.length;
		System.out.println("Total length of the String: " + totalLength);
		int specialCharacters = totalLength - (noOfAlphabets + noOfDigits + noOfSpaces);
		System.out.println("Special characters in the Sting are: " + specialCharacters);

	}

}
