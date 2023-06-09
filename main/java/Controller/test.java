package Controller;

import java.net.URLDecoder;
import java.sql.Date;
import java.time.LocalDate;

public class test {
	public static void main(String[] args) {
//		String test = URLDecoder.decode("%221%2C2%7Cvaccine1(1)%2Cvaccine2(2)%22").replaceAll("\"","");
//System.out.println(test);
//	
//	
		
//		String dateString = "month_6date_1";
//
//		// Split the date string into its components
//		String[] parts = dateString.split("_");
//
//		System.out.println(parts[1]);
//		System.out.println(parts[2]);
//		int month = Integer.parseInt(parts[1].replace("date", "")); // Extract the month number
//		int date = Integer.parseInt(parts[2]); // Extract the date number
//		int year = LocalDate.now().getYear(); // Get the current year
//
//		// Create a LocalDate object from the components
//		LocalDate localDate = LocalDate.of(year, month, date);
//
//		// Convert the LocalDate object to java.sql.Date object
//		java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
//
//		// Print the date in yyyy-MM-dd format
//		System.out.println(sqlDate.toString());
		String test = "askld(asdn";
		for (String string : test.split("\\(")) {
			System.out.println(string);
		}
	} 
	

}
