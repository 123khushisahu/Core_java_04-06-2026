package com.hksir11am;

public class StaticVBMPractice {
	
		static int a = m1();
		static int m1(){
			System.out.println("From m1 a: "+a);
			return 50;
		}
		static{
			System.out.println("From SB a: "+a);
		}
		public static void main(String[] args){
			System.out.println("From MM a: "+a);
		}
	}

