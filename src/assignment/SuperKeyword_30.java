package assignment;
//Program to demonstrate SUPER KEYWORD
class ParentClass{
	
	void parentClass() {
		System.out.println("Parent class method");
	}
}

public class SuperKeyword_30 extends ParentClass{

	void childClass() {
		super.parentClass();
		System.out.println("Child class method");
		super.parentClass();
	}
	public static void main(String[] args) {
		SuperKeyword_30 sp = new SuperKeyword_30();
		sp.childClass();
	}

}
