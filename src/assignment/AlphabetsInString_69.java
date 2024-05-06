package assignment;

import java.util.Arrays;

//In  a String Shekhar find out the number of alphabets involved
public class AlphabetsInString_69 {

	static int countAlphabets = 0;

	public static void main(String[] args) {

		String name = "Shekhar";
		char[] ch = name.toCharArray();
		System.out.println(Arrays.toString(ch));
		for (int i = 0; i < ch.length; i++) {
			boolean answer = Character.isAlphabetic(ch[i]);
			if (answer == true) {
				countAlphabets++;
			}
		}
		System.out.println(countAlphabets);

	}

}