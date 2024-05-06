package assignment;
//"Program to check if the input "Manish"starts with 'M'

public class MatchesFunctionAtStartingPosition_81 {

	public static void main(String[] args) {
		
		String name1 = "Shekhar";
		String name2 = "Manish";
		
		System.out.println(name1.matches(("M().*")));
		System.out.println(name2.matches(("M().*")));
	}

}
