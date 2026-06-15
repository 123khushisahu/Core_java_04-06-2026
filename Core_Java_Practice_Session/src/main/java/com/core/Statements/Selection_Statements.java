
package com.core.Statements;

import java.time.LocalDate;
/*
Java statements are mainly of 3 types:

Selection Statements – if, if-else, else-if, switch
Iteration Statements – for, while, do-while, for-each
Jump Statements – break, continue, return
*/

public class Selection_Statements {

	public static void main(String[] args) {
		   
      int age =22;
		
		if(age==22) {
			System.out.println("you are eligible for marriage");
		}
		else{
			System.out.println("you are not eligible for marriage");
			
		}
		
		
	     LocalDate  now= LocalDate.now();   
	     
	     System.out.println(now);
	     
	     
	     if(now.getMonthValue()==1) {
	    	 System.out.println("this is january month");
	     }
	     
	     else if(now.getMonthValue()==2) {
	    	 System.out.println("this is february month");
	     }
	     
	     if(now.getMonthValue()==6) {
	    	 System.out.println("this is june month");
	     }
	     
	     
	     
	     else {
	    	System.out.println("not found any month");
	     }
	     
	     
	     
	     
	     
	    /* Switch Statement in Java

	     A switch statement is used when you have multiple conditions 
	     based on the same variable. 
	     It is an alternative to multiple if-else-if statements.
	     
	     syntax: 
	     
	     switch (expression) {

	     case value1:
	         // code
	         break;

	     case value2:
	         // code
	         break;

	     case value3:
	         // code
	         break;

	     default:
	         // code
	 }
	        */
	     
	     int day=1;
	     
	     
	     switch (day) {
	     
	     case 1:System.out.println("monday");
	     break;
	     case 2:System.out.println("tuesday");
	     break;
	     case 3:System.out.println("wednesday");
	     break;
	     default:System.out.println("not found any day");
	     
	   }
	     
	     
	     
		
		

	}

}
