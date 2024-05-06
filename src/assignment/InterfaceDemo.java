package assignment;

interface Interface{
	void add();
	void substract();
}

public class InterfaceDemo implements Interface{
	
	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo();
		id.add();
		id.substract();
	}

	public void add() {
		System.out.println("Addition method");
	}

	public void substract() {
		System.out.println("Substraction method");
	}
}