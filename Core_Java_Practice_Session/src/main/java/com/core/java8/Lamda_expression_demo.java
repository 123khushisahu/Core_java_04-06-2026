package com.core.java8;

@FunctionalInterface
interface Message {
	
    void printMessage();
 }



@FunctionalInterface
interface TestInterface{
	
	int calculation(int a,int b);
}

public class Lamda_expression_demo {
	
	public static void main(String[] args) {
		
		Message m=()-> {
			System.out.println("welcome");
		
		};
		m.printMessage();
		
		
		System.out.println("----------------------------------------------");
		
		TestInterface t=(a, b)-> a*b;
		
		t.calculation(10, 50);
		
		
		
		
		
		
		
		
		
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//	    numbers.add(5);
//	    numbers.add(9);
//	    numbers.add(8);
//	    numbers.add(1);
	    
	   // for (type variableName : arrayName) {
	    	  // code block to be executed
	    //	}
	    
//	 for (Integer listvariable:numbers) {
//		 
//		 System.out.println(listvariable);
//		 
//		
//	}
//		
//	}
	//no name ,no access modifier, not return type, called anonymous function
	
	/*
	Java Lambda Expressions


	A lambda expression is a short block of code that takes in parameters and returns a value. Lambdas 
	look similar to methods, but they do not need a name, and they can be written right inside a method body.

	Syntax
	The simplest lambda expression contains a single parameter and an expression:

	1.
	parameter -> expression
	
	
	2.
	(parameter1, parameter2) -> expression
	
	3.
	(parameter1, parameter2) -> {
     // code block
    return result;
    }
    
    
	*/
	
	
	
	
	
    
  
	}
	

}
