/**
 * 
 */
package com.hervey.app;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

/**Exercises various LocalDate methods
 * @author Kent
 *
 */



public class LocalDateMethods {
	
	public static void DemoGets(){
		
		LocalDate sampleDate = LocalDate.of(1925, Month.NOVEMBER, 26);
		System.out.println("Standard output of Sample Date is:  " + sampleDate); 
		
		System.out.println(sampleDate.lengthOfYear());



		
	}


	
	
	 

	

}

