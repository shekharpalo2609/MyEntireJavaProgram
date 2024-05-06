package assignment;
/*
 * print o/p Date below format            
1) 16 Apr 2024      
2) 16-Apr-2024        
3) 16/Apr/2024
 */

import java.util.Date;

public class DateWithDFormat_61 {

	public static void main(String[] args) {
		Date date = new Date();
		
		String dateInString  = date.toString();
		
		String day = dateInString.substring(8, 10);
		
		String month = dateInString.substring(4, 7);
		
		String year = dateInString.substring(dateInString.length()-4);
		
		System.out.println(day +" "+ month + " "+ year);
		System.out.println(day +"-"+ month + "-"+ year);
		System.out.println(day +"/"+ month + "/"+ year);
	}

}
