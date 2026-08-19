
package com.hksir11am;

public class StaticBlock2 {
	
		static int a = 10;
		static {
			System.out.println("From SB");
			System.out.println("  a: "+ a);
			System.out.println("  b: "+ StaticBlock2.b);

			b = 50;
System.out.println("  b: "+ StaticBlock2.b);
//System.out.println("  b: "+b);

		}
		public static void main(String[] args){
			System.out.println("\nFrom MM");
			System.out.println("  a: "+ a);
			System.out.println("  b: "+ b);
		}
		static int b = 20;
	}

