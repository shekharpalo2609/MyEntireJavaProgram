package assignment;

import java.util.Arrays;

//In  a String Shekh ar Palo find out the number of spaces involved
public class SpacesInString_71 {

	static int noOfSpaces = 0;
	public static void main(String[] args) {
		String name = "Shekh ar Palo";
		char ch[] = name.toCharArray();
		System.out.println(Arrays.toString(ch));
		for(int i = 0; i< name.length(); i++) {
			boolean answer = Character.isSpaceChar(ch[i]);
			if(answer == true) {
				noOfSpaces++;
			}
			else {
				
			}
		}
		System.out.println(noOfSpaces);
	}

}
