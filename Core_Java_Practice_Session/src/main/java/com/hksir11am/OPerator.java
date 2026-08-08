package com.hksir11am;

	import java.util.Scanner;
	
	public class OPerator {
		/*Java follows this order:

1. *, /, % → first
2. +, - → after that
3. If operators have the same priority → left to right*/
		
		public static void main(String[] args) {

			Scanner scn = new Scanner(System.in);
			
			System.out.print("Enter num: ");
			int num = scn.nextInt(); //1. reading and storing value

			if(num < 0){ //2. performing validation
									//3. performing calculation
				System.out.println(num + " is a -ve number"); 
									
			}else if (num > 0){
				System.out.println(num + " is a +ve number");		
			
			}else{
				System.out.println("num is ZERO");
			}


			System.out.println();
			int c = num + 20;
			System.out.println("Result: "+ c);

		}
	

}
