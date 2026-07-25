package com.core.java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeApi_Duration {

	public static void main(String[] args) {
		
		// Duration example
      //  LocalTime start = LocalTime.of(9, 0);
      //  LocalTime end = LocalTime.of(11, 30);
      //  Duration duration = Duration.between(start, end);
      //  System.out.println("Minutes between: " + duration.toMinutes()); // 150
		
		
		//syntax:
		//LocalTime.of(hour, minute) एक specific time बनाता है।
		
		LocalTime starttime = LocalTime.of(04, 00);
		
		LocalTime endtime = LocalTime.of(9, 00);
		
		Duration between = Duration.between(starttime, endtime);
		
		System.out.println(between.toHours() + " ,"+ between.toMinutes() % 60);
		
		
		/*
		isLeapYear() 
		checks whether a given year is a leap year or not.

		Return Type:

		boolean
		Returns true → if the year is a leap year.
		Returns false → if the year is not a leap year.
		*/
		
		LocalDate now = LocalDate.of(2020,8,25);
		
		System.out.println(now.isLeapYear());
		
		
		
		
		
		//isBefore
		
		LocalDate vijaydob = LocalDate.of(1996,8,12);//.of means custom /manually i pass//.now means predefined pass
		
		LocalDate khushidob = LocalDate.of(2004,01,01);
		
		if(vijaydob.isBefore(khushidob)) {
			System.out.println("CORRECT ANSWER");
		}
		
		if(vijaydob.isAfter(khushidob)) {
			System.out.println("CORRECT ANSWER");
		}else {
			System.out.println("no");
		}
		
		if(vijaydob.isEqual(khushidob)) {
			System.out.println("CORRECT ANSWE");
		}else {
			System.out.println("nahi g");
		}
		
		
		
		
		
		

	}

}
