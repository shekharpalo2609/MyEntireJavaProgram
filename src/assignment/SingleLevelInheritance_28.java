package assignment;
//Program to demonstrate SINGLE LEVEL INHERITANCE
class Parent{
	static void parentMethod() {
		System.out.println("Parent class method");
	}
}

class child{
	
}

public class SingleLevelInheritance_28 extends Parent{

	public static void main(String[] args) {
		parentMethod();
		childMethod();
	}
	static void childMethod() {
		System.out.println("Child class method");
	}

}
