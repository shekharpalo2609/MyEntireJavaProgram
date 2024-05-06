package assignment;

abstract class Abstract{
	abstract void add();
}
public class AbstractDemo_31 extends Abstract{

	public static void main(String[] args) {
		AbstractDemo_31 a = new AbstractDemo_31();
		a.add();
	}

	void add() {
		System.out.println("Add method");
	}

}
