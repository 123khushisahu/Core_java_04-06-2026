package com.hksir11am;

public class NSB {
	
		static int m1(){
			System.out.println("From m1  a: "+ a);
			return 70;
		}
		static {
			System.out.println("From SB1 a: "+ NSB.a);
			a = 50;
		}
		static int a = m1();
		static{
			System.out.println("From SB2 a: "+ a);
		}
		public static void main(String[] args){
			System.out.println("From MM  a: "+ a);
		}
	}

