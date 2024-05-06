package assignment;

public class ExecutionOrder_13 {

	ExecutionOrder_13(){
		System.out.println("Constructor...");
	}
	
	{
		System.out.println("Instance initialization block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		ExecutionOrder_13 e = new ExecutionOrder_13();
	}

	static {
		System.out.println("static initializtion block...");
	}
	
}
