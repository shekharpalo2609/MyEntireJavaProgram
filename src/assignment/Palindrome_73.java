package assignment;
//Find out if given input is a palindrome

public class Palindrome_73 {
	public static void main(String[] args) {
		String input = "radar";
		System.out.println("Given string: " + input);
		String reverse = "";
		
		for(int i = input.length()-1; i>=0; i--) {
			char ch = input.charAt(i);
			reverse = reverse + ch;
			
		}
		System.out.println("String after reverse: "+reverse);
		
		if(input.equals(reverse)) {
			System.out.println("Given string is a palindrome!");
		}
		else {
			System.out.println("Given string is not a palindrome");
		}
	}

}
