package com.hksir11am;

public class StaticVStaticB {

	

		static int    a		= 10;
		static int    b		= a;
		static int    c		= StaticVStaticB.d;		
		static int    d		= 40;

		public static void main(String[] args) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}

	}

