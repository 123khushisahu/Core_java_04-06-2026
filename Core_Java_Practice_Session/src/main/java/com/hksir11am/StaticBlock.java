package com.hksir11am;

public class StaticBlock {

	

		static int a = 10;
		static {
			System.out.println("From SB");
			System.out.println("  a: "+ a);
			//System.out.println("  b: "+ b); CE: i f r
			System.out.println("  b: "+ StaticBlock.b);
		}
		public static void main(String[] args){
			System.out.println("\nFrom MM");
			System.out.println("  a: "+ a);
			System.out.println("  b: "+ b);
		}
		static int b = 20;
	}

