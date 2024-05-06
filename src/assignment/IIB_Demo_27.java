package assignment;

//Program to demonstrate IIB
public class IIB_Demo_27 {

	{
		System.out.println("Instance initialization block1");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		IIB_Demo_27 iib = new IIB_Demo_27();
	}
	{
		System.out.println("Instance initialization block2");
	}

}
