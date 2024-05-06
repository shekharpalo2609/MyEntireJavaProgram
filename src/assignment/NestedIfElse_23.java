package assignment;

//Program to demonstrate NESTED IF
public class NestedIfElse_23 {

	public static void main(String[] args) {
		
		int marks = 42;
		if(marks>=40) {
			if(marks>80) {
				System.out.println("Passed with A Grade");
			}
			else if(marks>60){
				System.out.println("Passed with B Grade");
			}
			else {
				System.out.println("Passed with C Grade");
			}
		}
		else {
			System.out.println("Failed");
		}
		
	}

}
