package com.hksir11am;

public class SBSV {

	
		static int a = 10;
		static {
			System.out.println("From SB");
			System.out.println("  a: "+ a);
			//System.out.println("  a: "+ b);			
			System.out.println("  b: "+ SBSV.b);

			b = 50;
			System.out.println("b "+SBSV.b);

		}
		//SB end hote hi static variable inti hoga main ke baad ka
		public static void main(String[] args){
			System.out.println("\nFrom MM");
			System.out.println("  a: "+ a);
			System.out.println("  b: "+ b);
		}
		static int b = 20;
	}

