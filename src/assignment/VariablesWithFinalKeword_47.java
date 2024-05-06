package assignment;
//Write a Program on creating method with LOCAL variable by using FINAL keyword  also try with Global variable
public class VariablesWithFinalKeword_47 {
	final static String name = "Shekhar";
	
	public void login() {
		final String username = "user";
		final String password = "root";
		//password = "root@123";
		System.out.println(username);
		System.out.println(password);
	}
	
	public static void main(String[] args) {
		VariablesWithFinalKeword_47 v = new VariablesWithFinalKeword_47();
		System.out.println(name);
		v.login();
	}

}
