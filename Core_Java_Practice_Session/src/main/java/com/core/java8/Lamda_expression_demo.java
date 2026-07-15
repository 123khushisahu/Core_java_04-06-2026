package com.core.java8;

public class Lamda_expression_demo {
	
	//no name ,no access modifier, not return type, called anonymous function
	
	//without lambda
	public int calculateNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	//without lambda
	public void showdata() {
		System.out.println("this is show methods....");
	}
	
      	//with lambda
		//  Integer a=() -> System.out.println("this is show methods....");
	
	
			
		
	
	
	
	

	public static void main(String[] args) {
		
		Lamda_expression_demo job=new Lamda_expression_demo();
		
		job.calculateNumber(10, 20);
		
	}

}
