package assignment;
//In the given array find out 41 is present or not. and display its count

public class NumberPresentInArray_74 {

	static int count;

	public static void main(String[] args) {

		int[] nos = new int[6];

		nos[0] = 41;
		nos[1] = 63;
		nos[2] = 22;
		nos[3] = 41;
		nos[4] = 41;
		nos[5] = 88;
		int checkNumber = 41;

		for (int i = 0; i < nos.length; i++) {
			if (nos[i] == checkNumber) {
				System.out.println(checkNumber + " is present at index value: " + i);
				count++;
			} else {
				System.out.println(checkNumber + " is not present at index value: " + i);
			}

		}
		System.out.println("Number of times " + checkNumber + " present in the given aray: " + count);
	}

}
