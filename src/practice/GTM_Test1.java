package practice;
//WAP with 1 main method, 2 constructors, 2 SIBs, 2 IIBs , 3 static and 3 non-static methods

public class GTM_Test1 {

	public static void main(String[] args) {
		System.out.println("main method");

		GTM_Test1 obj1 = new GTM_Test1();
		GTM_Test1 obj2 = new GTM_Test1(5);

		System.out.println(obj1);
		System.out.println(obj2);

		obj1.method_1();
		obj1.method_2();
		obj1.method_3();

		method1();
		method2();
		method3();
	}

	public GTM_Test1() {
		System.out.println("Non-parametrized constructor");
	}

	GTM_Test1(int a) {
		System.out.println("Parameterized constructor");
	}

	static {
		System.out.println("1st static block");
	}

	static {
		System.out.println("2nd static block");
	}

	{
		System.out.println("1st IIB");
	}

	{
		System.out.println("2nd IIB");
	}

	static void method1() {
		System.out.println("Static method 1");
	}

	static void method2() {
		System.out.println("Static method 2");
	}

	static void method3() {
		System.out.println("Static method 3");
	}

	void method_1() {
		System.out.println("Non Static method 1");
	}

	void method_2() {
		System.out.println("Non Static method 2");
	}

	void method_3() {
		System.out.println("Non Static method 3");
	}

}