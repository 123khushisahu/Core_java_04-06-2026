package com.hksir11am;



	public class Person {
		
		private static int eyes;
		private static int ears;
		
		private String name;
		private double height;
		private double weight;
		
		static {
			eyes = 2;
			ears = 2;
				
			System.out.println("Person class is loaded, \n SFs memory allocated, \n SB is executed and SFs are initialized");
		}
		
		private static int personsCount;
		
		{
			personsCount++;
		}
		
		public Person(String name, double height, double weight){

			this.name = name;
			this.height = height;
			this.weight = weight;
			
			System.out.println("Person class Param constructor is executed");
			System.out.println(" Person class NSFs are initiaized in " + super.toString() +" object");
		}

		//setter and getter methods for SFs
		public static void setEyes(int eyes){
			Person.eyes = eyes;
		}
		
		public static int getEyes(){
			return eyes;	
		}
		
		public static void setEars(int ears){
			Person.ears = ears;
		}
		
		public static int getEars(){
			return ears;	
		}

		public static int getPersonsCount(){
			return personsCount;	
		}	
		
		//setter and getter methods for NSFs
		public void setName(String name) {
			this.name = name;	
		}
		
		public String getName() {
			return name;	
		}
		
		public void setHeight(double height) {
			this.height = height;	
		}
		
		public double getHeight() {
			return height;	
		}
		
		public void setWeight(double weight){
			this.weight = weight;	
		}
		
		public double getWeight() {
			return weight;	
		}
		
		//Blogic method
		void eat(){
			System.out.println(name + " is eating");	
		}
		
		void walk(){
			System.out.println(name + " is walking");	
		}
		
		void sleep(){
			System.out.println(name + " is sleeping");	
		}
		
		//printing method
		@Override
		public String toString(){
			return	("  name\t\t: " + name)		+"\n"+
					("  height\t: " + height)	+"\n"+
					("  weight\t: " + weight)	+"\n"+
					("  eyes\t\t: " + eyes)		+"\n"+
					("  ears\t\t: " + ears)		;
		}
		
	}

