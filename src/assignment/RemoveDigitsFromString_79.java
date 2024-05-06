package assignment;
//Program to remove all the numeric values involved in a given string

public class RemoveDigitsFromString_79 {

	public static void main(String[] args) {

		String name = "Shekhar123";
		System.out.println(name.replaceAll("[0-9]", ""));
	}

}
