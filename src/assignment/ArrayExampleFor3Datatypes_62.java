package assignment;

public class ArrayExampleFor3Datatypes_62 {

	public static void main(String[] args) {

		String[] studentNames = new String[3];
		studentNames[0] = "Ashwini";
		studentNames[1] = "Kishor";
		studentNames[2] = "Mahesh";

		int[] rollNo = new int[3];
		rollNo[0] = 22;
		rollNo[1] = 33;
		rollNo[2] = 44;

		char[] gender = new char[3];
		gender[0] = 'F';
		gender[1] = 'M';
		gender[2] = 'M';

		System.out.println("Student_name   " + "  Student_roll_no  " + "  Sudent_gender");

		for (int i = 0; i < 3; i++) {
			System.out.println(studentNames[i] + "             " + rollNo[i] + "                       " + gender[i]);
		}
	}

}
