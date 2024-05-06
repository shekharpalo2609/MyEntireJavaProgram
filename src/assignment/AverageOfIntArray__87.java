package assignment;
//Create a Array length size[4]of int datatype find out the average of those 4 numbers

public class AverageOfIntArray__87 {

	static int sum;
	static double average;
	public static void main(String[] args) {

		int input[] = new int[4];
		
		input[0] = 60;
		input[1] = 40;
		input[2] = 20;
		input[3] = 80;
		
		for(int i = 0; i < input.length; i++) {
			sum = sum + input[i]; 
			average = sum/input.length;
		}
		System.out.println("Average of the given array is: " + average);
	}

}
