package assignment;

//Write a assertion program when name has empty string, some error should be thrown
public class AssertEmptyString_93 {

	public static void main(String[] args) {

		String input = "";
		assert input.length() > 0;
		System.out.println("String length is greater than 0!");
	}

}
