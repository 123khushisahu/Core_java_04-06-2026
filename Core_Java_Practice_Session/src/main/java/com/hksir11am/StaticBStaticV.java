package com.hksir11am;

public class StaticBStaticV {
	
		static int    a    = 10;
		static {
			System.out.println("From SB");
			System.out.println("  a: "+ a);
			System.out.println("  b: "+ StaticBStaticV.b);
			m1();
		}
		static void m1() {
			System.out.println("  From SM");
			System.out.println("    b: "+ b);
		}
		public static void main(String[] args) {
			System.out.println("\nFrom MM");
			System.out.println("  a: "+ a);
			System.out.println("  b: "+ b);
			m1();
		}
		static int    b    = 20;
	}

