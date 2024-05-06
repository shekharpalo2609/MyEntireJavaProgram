package assignment;
//Program to demonstrate THIS() CALLING statement
public class ThisCallingStatement_34 {
	
	public ThisCallingStatement_34() {
		System.out.println("Non parameterized constructor1");
	}

	public ThisCallingStatement_34(String name) {
		this();
		System.out.println("Parameterized constructor1 - String type");
	}
	
	public ThisCallingStatement_34(int id) {
		this("");
		System.out.println("Parameterized constructor2 - int type");
	}
	public static void main(String[] args) {
		new ThisCallingStatement_34(22);
		System.out.println("main method");
	}

}
