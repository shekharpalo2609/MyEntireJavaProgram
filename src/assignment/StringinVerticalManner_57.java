package assignment;

/*Input: priya
Output:
a
y
i
r
p
*/

public class StringinVerticalManner_57 {
	static String name = "priya";
	
	public static void main(String[] args) {
		for(int i = name.length()-1; i >= 0; i--) {
			char ch = name.charAt(i);
			System.out.println(ch);
		}
	}

}
