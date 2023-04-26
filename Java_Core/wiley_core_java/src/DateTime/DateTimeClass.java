package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//current date
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);
		
		//current time
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
		
		//current date time
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Before formatting : "+myDateTime);
		
		DateTimeFormatter myModDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		String modDateTime = myDateTime.format(myModDateTime);
		System.out.println("After formatting :"+modDateTime);
		
		// yyyy-MM-dd
		DateTimeFormatter myModDateTime2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		String moddateTime2 = myDateTime.format(myModDateTime2);
		System.out.println("Pattern 2 : "+moddateTime2);
		
		// dd/MM/yyyy
		DateTimeFormatter myModDateTime3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH-mm-ss");
		String moddateTime3 = myDateTime.format(myModDateTime3);
		System.out.println("Pattern 3 : "+moddateTime3);
		
		// dd-MMM-yyyy
		DateTimeFormatter myModDateTime4 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH-mm-ss");
		String moddateTime4 = myDateTime.format(myModDateTime4);
		System.out.println("Pattern 4 : "+moddateTime4);
		
		//E, MM dd yyyy
		DateTimeFormatter myModDateTime5 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH-mm-ss");
		String moddateTime5 = myDateTime.format(myModDateTime5);
		System.out.println("Pattern 5 : "+moddateTime5);
		
		
//		String dateStr = "26/04/2023";
//		LocalDate date = LocalDate.parse(dateStr, format);
//		System.out.println(date);
	}

}
