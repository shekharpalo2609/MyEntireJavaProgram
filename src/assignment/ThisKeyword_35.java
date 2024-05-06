package assignment;

//Program to demonstrate THIS KEYWORD
public class ThisKeyword_35 {

	int rollNo;
	String name;
	int marks;
	String school;

	ThisKeyword_35(int Studentmarks, String studentName, String schoolName, int studentRoll) {
		this.rollNo = studentRoll;
		this.name = studentName;
		this.marks = Studentmarks;
		this.school = schoolName;
	}

	public static void main(String[] args) {
		ThisKeyword_35 tk = new ThisKeyword_35(25, "Ajay", "DBPS", 6);
		System.out.println(tk.rollNo);
		System.out.println(tk.name);
		System.out.println(tk.marks);
		System.out.println(tk.school);

	}

}
