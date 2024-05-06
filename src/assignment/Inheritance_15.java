package assignment;

interface GranftherProperty {
	void land();
	void house();
}

abstract class Father implements GranftherProperty {
	abstract void gold();
	abstract void hotel();
}

public class Inheritance_15 extends Father {
	@Override
	public void land() {
	}
	@Override
	public void house() {
	}
	@Override
	void gold() {
	}
	@Override
	void hotel() {
	}
	public static void main(String[] args) {
		System.out.println("End");
	}
	
}
