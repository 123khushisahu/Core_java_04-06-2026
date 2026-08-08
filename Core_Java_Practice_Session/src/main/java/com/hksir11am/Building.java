package com.hksir11am;

public class Building {
	
		public static void main(String[] args) {

			RoomSetter r1 = new RoomSetter();
			System.out.println("r1 values: ");
			r1.display();
			System.out.println( );	

			r1.setL(100);
			r1.setB(30);

			System.out.println("r1 values: ");
			r1.display();
			System.out.println( );	

			r1.findArea();
			r1.findPerimeter();

			System.out.println();
	
		}
	}


