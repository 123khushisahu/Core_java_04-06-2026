package com.core_java.Oop;

import java.util.Scanner;

public class InterfaceExample  {
	
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter i value:");
	  int i=sc.nextInt();

	  System.out.println("Enter j value:");
	  int j=sc.nextInt();
   // Pig myPig = new Pig();

	  Animal1 myPig = new Pig();  //upcasting 
    
    myPig.animalSound();  //without parameter
    myPig.sleep();
    
    
    
    myPig.animalSoundWithParameter(i,j);  //with parameter
  }
}



