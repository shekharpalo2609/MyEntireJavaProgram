package assignment;

abstract class Animal{
	abstract void eat();
	abstract void sleep();
}

abstract class WildAnimal extends Animal{
	abstract void hunt();
	abstract void run();
	void eat() {
		
	}
	
	void sleep() {
		
	}
}


public class AbstractAndConcrete_14 extends WildAnimal{
	public static void main(String[] args) {
	}

	@Override
	void hunt() {
	}
	void run() {
	}
}
