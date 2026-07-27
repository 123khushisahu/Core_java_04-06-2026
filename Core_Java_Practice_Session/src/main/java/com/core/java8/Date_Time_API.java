package com.core.java8;

import java.text.Format;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Date_Time_API {

	public static void main(String[] args) {
		
		
		/*
		Java 8 introduced the Date and Time API in the java.time
		package to replace the old Date and Calendar classes. It is immutable, 
		thread-safe, easy to use, and provides separate classes for date, time, date-time, time zones, 
		formatting, parsing, and date/time calculations. It follows the ISO-8601 standard and makes working with 
		dates and times much simpler and more reliable.
		
		
		
		1. LocalDate (Date Only)
		-------------------------
		now()
		of()
		parse()
		getYear()
		getMonth()
		getMonthValue()
		getDayOfMonth()
		getDayOfWeek()
		getDayOfYear()
		isLeapYear()
		lengthOfMonth()
		lengthOfYear()
		plusDays()
		plusWeeks()
		plusMonths()
		plusYears()
		minusDays()
		minusWeeks()
		minusMonths()
		minusYears()
		withDayOfMonth()
		withMonth()
		withYear()
		isBefore()
		isAfter()
		isEqual()
		compareTo()
		format()

		==================================================

		2. LocalTime (Time Only)
		-------------------------
		now()
		of()
		parse()
		getHour()
		getMinute()
		getSecond()
		getNano()
		plusHours()
		plusMinutes()
		plusSeconds()
		minusHours()
		minusMinutes()
		minusSeconds()
		withHour()
		withMinute()
		withSecond()
		isBefore()
		isAfter()
		compareTo()
		format()

		==================================================

		3. LocalDateTime (Date + Time)
		-------------------------------
		now()
		of()
		parse()
		getYear()
		getMonth()
		getDayOfMonth()
		getHour()
		getMinute()
		getSecond()
		plusDays()
		plusMonths()
		plusYears()
		plusHours()
		plusMinutes()
		minusDays()
		minusMonths()
		minusYears()
		minusHours()
		minusMinutes()
		withYear()
		withMonth()
		withDayOfMonth()
		withHour()
		withMinute()
		isBefore()
		isAfter()
		compareTo()
		format()
		toLocalDate()
		toLocalTime()

		==================================================

		4. ZonedDateTime (Date + Time + Time Zone)
		-------------------------------------------
		now()
		of()
		parse()
		getZone()
		getOffset()
		plusDays()
		minusDays()
		withZoneSameInstant()
		toLocalDate()
		toLocalTime()
		format()

		==================================================

		5. ZoneId (Time Zone)
		----------------------
		of()
		systemDefault()
		getAvailableZoneIds()

		==================================================

		6. Instant (UTC Timestamp)
		---------------------------
		now()
		ofEpochMilli()
		ofEpochSecond()
		plusSeconds()
		minusSeconds()
		toEpochMilli()
		atZone()

		==================================================

		7. Period (Difference Between Dates)
		------------------------------------
		between()
		ofDays()
		ofMonths()
		ofYears()
		getDays()
		getMonths()
		getYears()
		isZero()
		isNegative()

		==================================================

		8. Duration (Difference Between Times)
		--------------------------------------
		between()
		ofHours()
		ofMinutes()
		ofSeconds()
		toHours()
		toMinutes()
		toSeconds()
		isZero()
		isNegative()

		==================================================

		9. DateTimeFormatter (Formatting & Parsing)
		-------------------------------------------
		ofPattern()
		format()
		parse()

		Predefined Formatters:
		ISO_DATE
		ISO_LOCAL_DATE
		ISO_LOCAL_TIME
		ISO_LOCAL_DATE_TIME
		ISO_DATE_TIME

		==================================================

		10. Year
		---------
		now()
		of()
		getValue()
		isLeap()
		plusYears()
		minusYears()

		==================================================

		11. YearMonth
		--------------
		now()
		of()
		getYear()
		getMonth()
		lengthOfMonth()

		==================================================

		12. MonthDay
		-------------
		now()
		of()
		getMonth()
		getDayOfMonth()

		==================================================

		13. Month (Enum)
		----------------
		JANUARY
		FEBRUARY
		MARCH
		APRIL
		MAY
		JUNE
		JULY
		AUGUST
		SEPTEMBER
		OCTOBER
		NOVEMBER
		DECEMBER

		Methods:
		values()
		valueOf()
		plus()
		minus()
		getValue()
		length()

		==================================================

		14. DayOfWeek (Enum)
		--------------------
		MONDAY
		TUESDAY
		WEDNESDAY
		THURSDAY
		FRIDAY
		SATURDAY
		SUNDAY

		Methods:
		values()
		valueOf()
		plus()
		minus()
		getValue()

		==================================================

		15. ChronoUnit
		--------------
		DAYS
		WEEKS
		MONTHS
		YEARS
		HOURS
		MINUTES
		SECONDS

		Method:
		between()

		==================================================

		16. TemporalAdjusters
		---------------------
		firstDayOfMonth() - done
		lastDayOfMonth()
		firstDayOfYear()
		lastDayOfYear()
		next()
		nextOrSame()
		previous()
		previousOrSame()
		
LocalDate
LocalTime
LocalDateTime
ZonedDateTime
ZoneId
Instant
Period
Duration
DateTimeFormatter
ChronoUnit



		
		*/
		System.out.println(LocalDate.now());
		
		LocalDate now = LocalDate.now();
		
		System.out.println(now.getYear() + "/"  + now.getMonth() + "/"+ now.getDayOfMonth());//custom date 
		
		//current time 
	LocalTime currenttime=LocalTime.now();
	System.out.println(currenttime);
	
	
	//local date and time
	
	 LocalDateTime time= LocalDateTime.now();
	 
	System.out.println(time);
	 
	 
	 DateTimeFormatter ofpattern = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");
	 
	 String formatedvalue = time.format(ofpattern);
	 System.out.println(formatedvalue);
	 
	 
	 
	 
	// LocalDate date1 = LocalDate.now();

    // LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);

     //Period gap = Period.between(date2, date1);
     //System.out.println("gap between dates " + "is a period of " + gap);
	 
	 
	 //period 
	 LocalDate todaydate= LocalDate.now();
	 
	LocalDate previousdate= LocalDate.of(1996, Month.AUGUST, 12);
	
	  System.out.println(Period.between(todaydate, previousdate));  
	  
	  LocalDate todaydate1=LocalDate.now();
	  LocalDate previouDate1=LocalDate.of(2004, Month.FEBRUARY, 28);
	  System.out.println(Period.between(todaydate1, previouDate1));
	  
	//firstDayOfMonth()
	  LocalDate date=LocalDate.of(2021, 06, 2021);
	  System.out.println(date.with(TemporalAdjusters.firstDayOfNextMonth()));
	  System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()));
	  System.out.println(date.with(TemporalAdjusters.firstDayOfNextYear()));
	  
	  System.out.println(date.with(TemporalAdjusters.firstDayOfMonth()));
	  System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()));
	  System.out.println(date.with(TemporalAdjusters.firstDayOfYear()));
	  System.out.println(date.with(TemporalAdjusters.lastDayOfYear()));
  
	  System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
	  System.out.println(date.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)));
	  System.out.println(date.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)));

	  
	  //LocalDate
	 /* Definition

	  LocalDate represents only a date (Year-Month-Day) without time and timezone.

	  Used For
	  Birthday
	  Joining date
	  Holiday
	  Date of birth
	  Example*/
	  LocalDate date2 = LocalDate.now();

	  System.out.println(date2);
	  // Output: 2026-07-24
	
	  //2. LocalTime
	  /*Definition

	  LocalTime represents only time (Hour-Minute-Second-Nanosecond) without date and timezone.

	  Used For
	  Office timing
	  Alarm time
	  Store opening time
	  Example*/
	  LocalTime time1 = LocalTime.now();

	  System.out.println(time1);
	  // Output: 17:45:20.123
	}

}
