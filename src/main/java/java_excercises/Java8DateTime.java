package java_excercises;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjusters;

public class Java8DateTime {

	public static void date() {
		LocalDate today = LocalDate.now(Clock.systemDefaultZone());
		LocalDate today1 = LocalDate.now(ZoneId.of("Asia/Kolkata"));

		System.out.println("************************Java Date Functionality************************");
		System.out.println(today);
		System.out.println(today1);
	}

	public static void time() {
		LocalTime time = LocalTime.now(Clock.system(ZoneId.of("Asia/Kolkata")));
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.ofSecondOfDay(3600);

		System.out.println("************************Java Time Functionality************************");
		System.out.println(time);
		System.out.println(time1);
		System.out.println(time2);

	}

	public static void dateTime() {
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime today1 = LocalDateTime.ofEpochSecond(3600, 0, ZoneOffset.UTC);
		System.out.println("************************Java DateTime Functionality************************");
		System.out.println(today);
		System.out.println(today1);
	}

	public static void instant() {
		Instant timestamp = Instant.now();
		Instant specificTimeStamp = Instant.ofEpochMilli(timestamp.toEpochMilli());
		System.out.println("************************Java Inatant Functionality************************");
		System.out.println(timestamp);
		System.out.println(specificTimeStamp);
		Duration duration = Duration.ofDays(15);
		Duration duration1 = Duration.ofHours(2);
		System.out.println(duration);
		System.out.println(duration1);
	}

	public static void dateTimeAPIUtility() {
		LocalDate today = LocalDate.now();
		System.out.println("************************Java DateTime API Functionality************************");
		System.out.println(today.getYear() + " is leap year ? " + today.isLeapYear());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getMonth());
		System.out.println(today.getYear());
		System.out.println(today + " is before " + today.minusDays(5) + " " + today.isBefore(today.minusDays(5)));
		System.out.println(today + " is after 2018-08-01 " + today.isAfter(LocalDate.of(2018, 8, 1)));
		System.out.println(today.atTime(LocalTime.now()));
		System.out.println("2 days from today " + today.plusDays(2));
		System.out.println("1 week from today " + today.plusWeeks(1));
		System.out.println("1 month from today " + today.plusMonths(1));
		System.out.println("First Day of this month is " + today.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("Last Day of this month is " + today.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("Last Day of this year is " + today.with(TemporalAdjusters.lastDayOfYear()));
		Period period = today.until(today.with(TemporalAdjusters.lastDayOfYear()));
		System.out.println("Remaining months of this year " + period.getMonths());

	}

	public static void main(String ar[]) {
		Java8DateTime.date();
		Java8DateTime.time();
		Java8DateTime.dateTime();
		Java8DateTime.instant();
		Java8DateTime.dateTimeAPIUtility();

	}

}
