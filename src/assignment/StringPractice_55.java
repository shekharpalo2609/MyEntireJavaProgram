package assignment;
//Practice String problems all of them 

public class StringPractice_55 {

	public static void main(String[] args) {
		
		String str = "String functions";
		String concat = " in java";
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf('g'));
		System.out.println(str.contains("ion"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str + concat);
		System.out.println(concat.trim());
	}

}
