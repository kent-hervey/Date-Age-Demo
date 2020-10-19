package com.hervey.app;

import java.time.LocalDate;
import java.time.Month;

public class DateAgeDemoApp {

	public static void main(String[] args) {
		
		LocalDate localDate3 = LocalDate.of(1930, Month.JANUARY, 1);
		LocalDate currentDate = LocalDate.now();

		
		int theAge = AgeCalculator.calculateAge();
		System.out.println("An Age is: " + theAge);
				
				
		int theAge2 = AgeCalculator.calculateAge(localDate3, currentDate);
		System.out.println("Age using passed in arguments is:  " + theAge2);
		

	}

}
