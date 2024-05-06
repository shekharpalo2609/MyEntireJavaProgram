package assignment;
//How to check if the String Contains Only Digits?
public class DigitsInString_89 {
	static int numbersInString1 = 0;
	static int numbersInString2 = 0;
	public static void main(String[] args) {
		String input1 = "Numbers 123";
		String input2 = "123456";
		System.out.println("String1: "+ input1);
		System.out.println("String2: "+ input2);	
		char[] ch1 = input1.toCharArray();
		char[] ch2 = input2.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			boolean answer1 = Character.isDigit(ch1[i]);
			if (answer1 == true) {
				numbersInString1++;
			}
		}
		if (numbersInString1 == ch1.length) {
			System.out.println("My String1 only contains digits");
		} else {
			System.out.println("My String1 does not contains only digits");
		}
		for (int i = 0; i < ch2.length; i++) {
			boolean answer2 = Character.isDigit(ch2[i]);
			if (answer2 == true) {
				numbersInString2++;
			}
		}
		if (numbersInString2 == ch2.length) {
			System.out.println("My String2 only contains digits");
		} else {
			System.out.println("My String2 does not contains only digits");
		}

	}
}
