package assignment;

import java.util.Date;

//program on DATE class with past, future and present time
public class DateClass_60 {

	public static void main(String[] args) {
		
		Date date1 = new Date();

		Date currentDate = new Date(date1.getTime());
		System.out.println("Current Date -> "+ currentDate);
		
		Date pastDate = new Date(date1.getTime()-(60*60*1000*24*3));
		System.out.println("Pass Date -> "+ pastDate);
		
		Date futuredate = new Date(date1.getTime()+(60*60*1000*24*10));
		System.out.println("Future Date -> "+ futuredate);
		
	}

}
