package assignment;

import java.util.Arrays;

public class ArrayEqualCheck_67 {

	public static void main(String[] args) {
		int[] arr1 = new int [4];
        int[] arr2 = new int [4];
        int[] arr3 = new int [4];
        
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;
        arr1[3] = 3;
        
        arr2[0] = 9;
        arr2[1] = 2;
        arr2[2] = 4;
        arr2[3] = 4;
        
        arr3[0] = 0;
        arr3[1] = 1;
        arr3[2] = 2;
        arr3[3] = 3;
        
        System.out.println("is arr1 equals to arr2 : " + Arrays.equals(arr1, arr2));
        System.out.println("is arr1 equals to arr3 : " + Arrays.equals(arr1, arr3));
	}

}
