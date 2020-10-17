package com.hervey.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static com.hervey.app.AgeCalculator.calculateAge;
import static java.time.LocalDate.of;


class AgeCalculatorTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCalculatorAge_Success() {
		
		LocalDate birthdatePassedIn = LocalDate.of(1985, Month.JUNE, 14);
		LocalDate currentDate = LocalDate.now();
		int expectedAgeResult = 15+20; //for 2020
		int actual = AgeCalculator.calculateAge(birthdatePassedIn, currentDate);
		System.out.println(actual);
		Assert.assertEquals(expectedAgeResult, actual);
		
	}
	
	@Test
	public void ageReturnedIsDatePassedInMinusBirthdateWhenDayOfDateIsAfterDayOfBirthdate() {
		
		// Arrange
		int birthYear = 1955;
		int datesYearPassedIn = 2000;
		int expected = datesYearPassedIn - birthYear;
		
		LocalDate birthDate = of(birthYear, 12, 2);  //only have month and DOM once give power to test.  No need to think of current date
		LocalDate datePassedIn = of(datesYearPassedIn, birthDate.getMonthValue(), birthDate.getDayOfMonth() + 1);
		
		// Act
		int actual = calculateAge(birthDate, datePassedIn);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void ageReturnedIsDatePassedInMinusBirthdateMinusOneWhennDayOfDateIsBeforeDayOfBirthdate() {
		
		//Arrange
		int birthYear =1985;
		int dateYearPassedIn = 2000;
		int expected = dateYearPassedIn - birthYear -1;
		
		LocalDate birthDate = of(birthYear, 12, 2);
		LocalDate datePassedIn = of(dateYearPassedIn, birthDate.getMonthValue(), birthDate.getDayOfMonth() -1);
		
		// Act
		int actual = calculateAge(birthDate, datePassedIn);
		
		//Assert
		assertEquals(expected, actual);
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
