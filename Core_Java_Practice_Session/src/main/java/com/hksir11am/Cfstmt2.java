package com.hksir11am;

import java.util.Scanner;

public class Cfstmt2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter letter: ");
		String letter = scn.next();
		char   lcLetter = letter.toLowerCase().charAt(0);
		
		if(lcLetter=='a' || lcLetter=='e' || 
				lcLetter=='i' || lcLetter=='o' || lcLetter=='u') {
				System.out.println(letter +" is an vowel");
		}else{
			System.out.println(letter +" is a consonent");
		}
	}

}
