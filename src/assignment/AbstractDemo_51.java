package assignment;
//Program to demonstrate ABSTRACT CLASS with C-CA-CA

abstract class Abstract1 {
	abstract void login();
}

abstract class Abstract2 extends Abstract1 {
	abstract void signUp();

}

public class AbstractDemo_51 extends Abstract2 {

	public static void main(String[] args) {
		AbstractDemo_51 abs = new AbstractDemo_51();
		abs.login();
		abs.signUp();
		abs.authentication();
	}

	void authentication() {
		System.out.println("Child class method");
	}

	void signUp() {
		System.out.println("Abstract class 2 method");
	}

	void login() {
		System.out.println("Abstract class 1 method");
	}

}
