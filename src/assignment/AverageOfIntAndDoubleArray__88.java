package assignment;
/*Program to find the average of values of two arrays – one int array of size 4 and 
one double array of size 4.*/

public class AverageOfIntAndDoubleArray__88 {

	static int sum1;
	static double sum2;

	public static void main(String[] args) {

		int inputInt[] = new int[4];

		inputInt[0] = 60;
		inputInt[1] = 40;
		inputInt[2] = 20;
		inputInt[3] = 80;

		for (int i = 0; i < inputInt.length; i++) {
			sum1 = sum1 + inputInt[i];
		}
		System.out.println("Addition of int array is: " + (sum1));

		double inputDouble[] = new double[4];

		inputDouble[0] = 60.2;
		inputDouble[1] = 40.5;
		inputDouble[2] = 20.6;
		inputDouble[3] = 80.8;

		for (int i = 0; i < inputDouble.length; i++) {
			sum2 = sum2 + inputDouble[i];

		}
		System.out.println("Addition of double array is: " + (sum2));
		System.out.println("Addition of both arrays is: " + (sum1 + sum2));
		System.out.println("Average of both arrays is: " + (sum1 + sum2) / 2);
	}

}