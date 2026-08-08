package com.hksir11am;

public class VariableShadowing {

			int x = 10;
			
			void m1() {
				int  x = 50;
				System.out.println(x);
				System.out.println(this.x);
				//System.out.println(e1.x);
				

			
			}
			public static void main(String[] args) {
				
				VariableShadowing e1 = new VariableShadowing();
				e1.m1();

			}
		}
	


