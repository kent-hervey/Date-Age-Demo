package com.hervey.app;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Calculates age given LocalDate birthdate and LocalDate now
 * @author Kent
 *
 */
public class AgeCalculator {

	LocalDate birthDate = LocalDate.of(1930, Month.JANUARY, 1);
	LocalDate today = LocalDate.now();

	public static int calculateAge() {
		LocalDate sampleBirthDate = LocalDate.of(1925, Month.NOVEMBER, 26);
		LocalDate currentDate = LocalDate.now();

		if ((sampleBirthDate != null) && (currentDate != null)) {
			return Period.between(sampleBirthDate, currentDate).getYears();
		} else {
			return 0;
		}
	}

	public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
		if ((birthDate != null) && (currentDate != null)) {
			return Period.between(birthDate, currentDate).getYears();
		} else {
			return 0;
		}
	}

}
