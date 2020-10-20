package com.hervey.app;

import java.time.Year;

public class YearMethods {
	
	public static void demoYear() {
	
	boolean isLeap = Year.isLeap(1961);
	System.out.println("is isleap a leap year?  " + isLeap);
	
	System.out.println("instance of year:  " + Year.of(1960));
	
	String stringOfYear = Year.of(1960).toString();
	}

}
