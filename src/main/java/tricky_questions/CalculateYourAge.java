package tricky_questions;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculateYourAge {

	public static void main(String ar[]) {
		LocalDate dobDate = LocalDate.of(1993, 8, 29);
		LocalDate today = LocalDate.now();
		Period age = Period.between(dobDate, today);
		System.out.printf("\nI am  %d years, %d months and %d days old.\n", age.getYears(), age.getMonths(),
				age.getDays());

		LocalDate dobDate1 = LocalDate.of(1993, Month.AUGUST, 29);
		LocalDate today1 = LocalDate.now();
		Period age1 = Period.between(dobDate1, today1);
		System.out.printf("\nI am  %d years, %d months and %d days old.\n", age1.getYears(), age1.getMonths(),
				age1.getDays());

	}

}
