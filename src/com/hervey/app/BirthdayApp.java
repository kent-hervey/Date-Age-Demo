package com.hervey.app;

import java.time.LocalDate;
import java.time.Month;

public class BirthdayApp {

	public static void main(String[] args) {
		
		LocalDate localDate3 = LocalDate.of(1930, Month.JANUARY, 1);
		LocalDate currentDate = LocalDate.now();
		
		
		System.out.println("local date is:  " + localDate3);
		
		int theAge = AgeCalculator.calculateAge();
		
		int theAge2 = AgeCalculator.calculateAge(localDate3, currentDate);
		
		
		
		System.out.println("ge here: " + theAge);
		
		System.out.println("and here" + theAge2);
		

	}

}
