package batch;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList090524 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(22);
		al.add(66);
		al.add(24);
		al.add(90);
		al.add(-55);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		
	}

}
