package assignment;
//Program to demonstrate LOGICAL OPERATOR NOT with OR  operator
public class NotWithOr_39 {

	public static void main(String[] args) {
		int a = 100;
		int b = 50;
		
		if(!(a > 80 || b > 500)) {
			System.out.println("Atleast 1 condition is true");
		}
		else {
			System.out.println("Both the condition are false");
		}
		
		
	}

}
