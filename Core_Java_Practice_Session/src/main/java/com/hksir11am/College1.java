package com.hksir11am;

public class College1 {

	
			
			public static void main(String[] args) {
			
				//creating Student object by using NPC
				Studentt s1 = new Studentt(); //all fields contains default values
				
				//creating Student object by using PC, contains given values
				Studentt s2 = new Studentt(102, "BK", "Acting", 3500, 5.9, 90);

				System.out.println("\ns1 object details");
				System.out.println(s1); //internally calls s1.toString() method
										//it is executed from Student class
										//returns s1 object's state and printed on console
				System.out.println();

				System.out.println("\ns2 object details");
				System.out.println(s2); //here also inernally s2.toString()
				System.out.println();   //is called and s2 object data is printed
					
				s2.eat();
				s2.sleep();

				s2.listen();
				s2.reply();
				s2.write();
				s2.read();
				
		/**/
			}
		}
	


