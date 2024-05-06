package batch;

import java.util.Arrays;

public class Demo {
	static int noOfAlphabets = 0;
	static int noOfDigits = 0;
	static int noOfSpaces = 0;
	static int specialCharacters = 0;

	public static void main(String[] args) {
		String name = "Shekhar @123 Palo!";
		char[] ch = name.toCharArray();
		System.out.println(Arrays.toString(ch));
		for (int i = 0; i < ch.length; i++) {
			boolean answer1 = Character.isAlphabetic(ch[i]);
			boolean answer2 = Character.isDigit(ch[i]);
			boolean answer3 = Character.isSpaceChar(ch[i]);
			if (!(answer1 == true || answer2 == true || answer3 == true)) {
				specialCharacters++;
			}
			System.out.println("Alphabets: " + noOfAlphabets);
			System.out.println("Digits: " + noOfDigits);
			System.out.println("Spaces: " + noOfSpaces);

			System.out.println("Special characters in the Sting are: " + specialCharacters);
		}
	}
}