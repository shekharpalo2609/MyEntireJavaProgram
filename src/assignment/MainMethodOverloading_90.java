package assignment;
//Demonstrate main method overloading.

public class MainMethodOverloading_90 {

	public static void main(String[] args) {
		System.out.println(1);
		
		main();
		main("s");
		main(0);
	}
	
	public static void main() {
		System.out.println(2);
	}

	public static void main(String s) {
		System.out.println(3);
	}

	public static void main(int i) {
		System.out.println(4);
	}
}
