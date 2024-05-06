package assignment;
//How to check if two strings are equals to each other

public class StringEqualCheck_66 {

	public static void main(String[] args) {
		
		String name1 = "Avinash";
		String name2 = "Jay";
		String name3 = "Avinash";
		
		if(name1.equals(name2)) {
			System.out.println(name1 + " equals "+ name2);
		}
		else {
			System.out.println(name1 + " is not equals to "+ name2);
		}
		
		
		if(name1.equals(name3)) {
			System.out.println(name1 + " equals "+ name3);
		}
		else {
			System.out.println(name1 + " is not equals to "+ name3);
		}
	}

}
