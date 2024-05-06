package assignment;

import java.util.Arrays;

//In  a String Shekhar124 find out the number of numeric values involved

public class NumericValuesInString_70{

	static int numbersInString = 0;
	public static void main(String[] args) {
		
		String name = "Shekhar1234";
		char[] ch = name.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i = 0; i<ch.length; i++) {
			boolean answer = Character.isDigit(ch[i]);
			if(answer == true) {
				numbersInString++;
			}
		}
		System.out.println(numbersInString);
	}

}
