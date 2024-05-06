package assignment;
//Program to demonstrate METHOD OVERRIDING

class Parents{
	static void parentMethod(){
		System.out.println("Parent class method");
	}
}
public class MethodOverriding_29 extends Parents{
	static void walk(){
		System.out.println("Child class method");
	}
	
	public static void main(String[] args) {
		walk();
	}

}
