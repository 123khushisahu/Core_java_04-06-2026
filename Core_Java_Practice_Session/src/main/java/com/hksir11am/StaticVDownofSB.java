package com.hksir11am;

public class StaticVDownofSB {

	
		static int m1() {
			System.out.println("From m1  a: "+ a);
			return 70;
		}
		static {
			System.out.println("From SB1 a: "+StaticVDownofSB.a);
			a = 50;
			System.out.println(StaticVDownofSB.a);
		}
		static int a = m1();
		static{
			System.out.println("From SB2 a: "+ a);
		}
		public static void main(String[] args){
			System.out.println("From MM  a: "+ a);
		}
	}

