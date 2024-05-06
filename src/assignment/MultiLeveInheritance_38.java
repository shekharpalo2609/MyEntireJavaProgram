package assignment;
//Demonstrate MULTILEVEL INHERITANCE

abstract class Plastic{
	
	abstract void color();
}

abstract class Chair extends Plastic{
	
	abstract void material();
}


public class MultiLeveInheritance_38 extends Chair{

	public static void main(String[] args) {
		
		MultiLeveInheritance_38 ml = new MultiLeveInheritance_38();
		ml.color();
		ml.material();
	}

	void material() {
		System.out.println("Chair class method");
	}

	void color() {
		System.out.println("Plastic class method");
	}

}
