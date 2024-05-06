package assignment;
//Program to demonstrate ABSTRACT CLASS with C-CA-C

class ConcreteClass {
	static void login() {
		System.out.println("Concrete Parent class");
	}

}

abstract class AbstractChild extends ConcreteClass {
	abstract void signup();
}

public class AbstractDemo2_52 extends AbstractChild {

	public static void main(String[] args) {
		login();
		authentication();
		AbstractDemo2_52 abs = new AbstractDemo2_52();
		abs.signup();
	}

	void signup() {
		System.out.println("Abstract Child class");
	}

	static void authentication() {
		System.out.println("Concrete Child class");
	}

}
