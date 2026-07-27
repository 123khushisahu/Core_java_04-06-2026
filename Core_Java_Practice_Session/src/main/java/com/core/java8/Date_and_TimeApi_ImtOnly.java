package com.core.java8;

import java.time.LocalDate;

/*
 * Top 30 Must-Know Methods (Interview Focus)
LocalDate.now()
LocalDate.of()
LocalDate.parse()

plusDays()
minusDays()

isBefore()
isAfter()
isEqual()

isLeapYear()

lengthOfMonth()

lengthOfYear()

getYear()
getMonth()
getMonthValue()
getDayOfMonth()

LocalTime.now()

LocalDateTime.now()

ZoneId.of()

ZonedDateTime.now()

Period.between()

Duration.between()

ChronoUnit.DAYS.between()

ChronoUnit.MONTHS.between()

ChronoUnit.YEARS.between()

DateTimeFormatter.ofPattern()

format()

parse()

TemporalAdjusters.firstDayOfMonth()

TemporalAdjusters.lastDayOfMonth()

TemporalAdjusters.next()

TemporalAdjusters.previous()

 */
public class Date_and_TimeApi_ImtOnly {
	public static void main(String[] args) {
		//.of
	LocalDate date=LocalDate.of(2003, 02, 28);
	System.out.println(date);
	
	LocalDate date1=LocalDate.now();
	System.out.println(date1);
	
	LocalDate date2=LocalDate.parse("2027-07-25");
	System.out.println(date2);


}
}
