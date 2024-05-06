package batch;

public class Typecasting_2904 {

	public static void main(String[] args) {
		//implicitly converting int to double -> widening
		double a = 50;		//here 50 is converted to 50.0
		System.out.println(a);  
		
		//explicitly converting int to double -> widening
		
		int age = 90;
		double agePerson = (double)age;
		System.out.println(agePerson);
//----------------------------------------------------------
		//explicity converting double to int -> narrowing
		
		double pi = 3.14;
		//int piInt = double(pi);
		
	}

}
