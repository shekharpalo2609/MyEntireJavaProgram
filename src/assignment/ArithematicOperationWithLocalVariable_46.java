package assignment;

//Program to do add,sub,mul,div using LOCAL variable
public class ArithematicOperationWithLocalVariable_46 {

	static void add() {
		int a = 10;
		int b = 20;
		System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
	}

	static void sub() {
		int a = 10;
		int b = 20;
		System.out.println("Substraction of " + a + " with " + b + " is: " + (a - b));
	}

	static void mul() {
		int a = 10;
		int b = 20;
		System.out.println("Multiplication of " + a + " with " + b + " is: " + (a * b));
	}

	static void div() {
		int a = 40;
		int b = 20;
		System.out.println("Division of " + a + " with " + b + " is: " + (a / b));
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
	}

}
