/**
 * 
 */
package com.hervey.app;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Set;

/**Exercises various LocalDate methods
 * @author Kent
 *
 */



public class LocalDateMethods {
	
	public static void DemoGets(){
		
		LocalDate sampleDate = LocalDate.of(1925, Month.NOVEMBER, 26);
		System.out.println("Standard output of Sample Date is:  " + sampleDate); 
		

		System.out.println("Month of this sampleDate is:  " + sampleDate.getMonth());
		System.out.println("Year of this sampleDate is:  " + sampleDate.getYear());
		System.out.println("Day number in this year is " + sampleDate.getDayOfYear());
		System.out.println("Length of this year in days is:  " + sampleDate.lengthOfYear());	
		System.out.println("year consumed to this sampleDate is:  " + ((double)  sampleDate.getDayOfYear()/sampleDate.lengthOfYear()));

		System.out.println("Day of month of this sampleDate is:  " + sampleDate.getDayOfMonth());
		int zoneIDOffset = -2;
		Set<String> zoneAvailableZoneIds = ZoneId.getAvailableZoneIds();
		
		System.out.println("System default time zone is:  " + ZoneId.systemDefault());
		
		for(String zoneId: zoneAvailableZoneIds) {
			System.out.println("Here is a Zone ID:  " + zoneId.toString());
		}
		
		ZoneId zoneIDChicago = ZoneId.of("America/Chicago");
		
		System.out.println("LocalDate using offset of " + LocalDate.now(zoneIDChicago));
		
	}


	
	
	 

	

}

