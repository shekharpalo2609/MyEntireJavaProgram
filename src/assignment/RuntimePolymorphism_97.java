package assignment;
//Use the Concept of Polymorphism and write the program of MethodOverriding and create the object of ParentCalss execute the Program.

class Parentdemo {

	void talk() {
		System.out.println("Parent class talk method");
	}
}

public class RuntimePolymorphism_97 {

	void talk() {
		System.out.println("Child class talk method");
	}

	public static void main(String[] args) {
		Parentdemo pd = new Parentdemo();
		pd.talk();
	}

}
