package assignment;
//Use the concept of assertion with array

public class AssertionWithArray_95 {

	public static void main(String[] args) {
		
		int[] input = new int[4];
		
		input[0] = 10;
		input[1] = 16;
		input[2] = 80;
        input[3] = 220;
        
        assert input[2] > 50:"Value of array index 2 is less than 50";
        System.out.println("Value of array index 2 is greater than 50");
	}

}
