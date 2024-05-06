package assignment;
//Program to demonstrate INTERFACE  try with 2 parents with 1 child class to achieve MULTIPLE LEVEL INHERITANCE concept

interface ParentInterface1{
	void login();
}

interface ParentInterface2{
	void signup();
}

public class InterfaceDemo_53 implements ParentInterface1, ParentInterface2{

	public static void main(String[] args) {
		InterfaceDemo_53 id = new InterfaceDemo_53();
		id.login();
		id.signup();
		id.authenticate();
	}
	
	public void login(){
		System.out.println("Grand parent interface");
	}

	public void signup(){
		System.out.println("Parent interface");
	}
	
	void authenticate() {
		System.out.println("Child concrete class");
	}
}
