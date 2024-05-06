package assignment;

/*Declare and initialize the Global variable and access then in main method by updating 
values , also by accessing default values
*/
public class UpdateGlobalVariable_48 {

	boolean b;
	byte by;
	char ch;
	short sh;
	int i = 5;
	long l = 255;
	double d;
	float f;
	String name = "Arjun";

	public static void main(String[] args) {
		UpdateGlobalVariable_48 ug = new UpdateGlobalVariable_48();
		ug.name = "Ajay";
		ug.i = 2569;
		ug.l = 25866;
		System.out.println("boolean default value is: " + ug.b);
		System.out.println("byte default value is: " + ug.by);
		System.out.println("char default value is: " + ug.ch);
		System.out.println("short default value is: " + ug.sh);
		System.out.println("double default value is: " + ug.d);
		System.out.println("float default value is: " + ug.f);
		System.out.println("Strig upated value is: " + ug.name);
		System.out.println("int upated value is: " + ug.i);
		System.out.println("long upated value is: " + ug.l);

	}

}
