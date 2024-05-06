package assignment;

//Program to demonstrate LOGICAL OPERATORS
public class LogicalOperators_24 {
	public static void main(String[] args) {

		int marks = 80;
		if (marks > 40 && marks > 80) {
			System.out.println("Passed with distinction");
		} else if (marks > 40 && marks > 60) {
			System.out.println("Passed with A Grade");

		} else if (!(marks < 40 && marks < 60)) {
			System.out.println("Passed with B Grade");

		} else if (!(marks > 40)) {
			System.out.println("Failed");

		}
	}

}
