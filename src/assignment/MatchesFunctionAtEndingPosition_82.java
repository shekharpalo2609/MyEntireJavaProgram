package assignment;
//Program to check if the input "Manish" ends with 'h'
public class MatchesFunctionAtEndingPosition_82 {

	public static void main(String[] args) {
	
		String name1 = "Manish";
		String name2 = "Grotechi";
		
		System.out.println(name1.matches("(.*)h"));
		System.out.println(name2.matches("(.*)h"));
	}

}
