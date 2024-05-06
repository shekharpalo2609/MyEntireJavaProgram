package assignment;

//Program to demonstrate LOGICAL OPERATOR NOT with AND operator
public class NotWithAND_40 {

	public static void main(String[] args) {
		int marks = 80;
		if (!(marks < 40 && marks < 60)) {
			System.out.println("Passed with B Grade");

		} else if (!(marks > 40)) {
			System.out.println("Failed");

		}
	}

}
