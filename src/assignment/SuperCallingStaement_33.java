package assignment;
//Program to demonstrate SUPER() CALLING statement

class ParentClassDemo{
	public ParentClassDemo() {
		System.out.println("Non-parameterized parent class constructor");
	}
	
	
	ParentClassDemo(String name) {
		System.out.println("Parameterized parent Class constructor");
	}
}

public class SuperCallingStaement_33 extends ParentClassDemo{

	SuperCallingStaement_33(){
		super("");
		System.out.println("Non parameterized child class constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		new SuperCallingStaement_33();
		
	}

}
