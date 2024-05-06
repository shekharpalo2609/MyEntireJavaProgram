package assignment;

//Input: priya   output: p r i y a
public class StringOutputWithSpace_56 {

	static String name ="priya";
	public static void main(String[] args) {
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			System.out.print(ch);
			System.out.print(" ");
		}
	}

}
