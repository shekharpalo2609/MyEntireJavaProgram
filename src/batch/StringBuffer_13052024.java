package batch;

public class StringBuffer_13052024 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Automation");
		sb1.append(" Testing");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
		String s2 = new String("Manual");
		s2 = s2.concat(" Testing");
		System.out.println(s2);
	}

}
