package com.hksir11am;

import java.util.Scanner;

public class Cfstmt {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter day number(1-7): ");
		int dayNum = scn.nextInt();

		if(dayNum==1)
			System.out.println("Today is Sunday");
		else if(dayNum==2)
			System.out.println("Today is Monday");
		else if(dayNum==3)
			System.out.println("Today is Tuesday");
		else if(dayNum==4)
			System.out.println("Today is Wednesday");
		else if(dayNum==5)
			System.out.println("Today is Thursday");
		else if(dayNum==6)
			System.out.println("Today is Friday");
		else if(dayNum==7)
			System.out.println("Today is Saturday");
		else
			System.out.println("Wrong number, enter only in between(1-7)");

	}
}
