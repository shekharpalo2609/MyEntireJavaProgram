package assignment;

//Program on hierarchical  LEVEL INHERITANCE accessing 1 parent with 2 child classes  by using all methods as static.

class Parent_1 {
	static void add() {
		System.out.println("Parent Method");
	}
}

public class HierarchicalInheritance_49 extends Parent_1 {

	public static void main(String[] args) {
		add();
	}

}
