package assignment;
//Write a assertion program when name has empty string, some error should be thrown with the assertion message as well
public class AssertEmptyStringWithAssertMsg_94 {

	public static void main(String[] args) {

		String name = "";
		assert name.length() > 0:"Empty String!";
		System.out.println("String length greater than 0");
	}

}
