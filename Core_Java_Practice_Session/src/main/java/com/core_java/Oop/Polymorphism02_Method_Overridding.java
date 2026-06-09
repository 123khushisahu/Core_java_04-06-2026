package com.core_java.Oop;


class Animal{
	public void show() {
		System.out.println("This is the Animal show methods.. ");
		
	}
}


class Pet extends Animal{
	public void show() {
		System.out.println("This is the Pet show methods.. ");
		
	}
}




public class Polymorphism02_Method_Overridding extends Animal  {

	public static void main(String[] args) {
		
		Polymorphism02_Method_Overridding overridding=new Polymorphism02_Method_Overridding();
		
		overridding.show();
		
		
		
		
		

	}

}
