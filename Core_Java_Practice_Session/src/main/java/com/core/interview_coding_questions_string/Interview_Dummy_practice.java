package com.core.interview_coding_questions_string;

public class Interview_Dummy_practice {
	
	public void method(Object obj) {
		System.out.println(" method1");
	}
	
	
	public void method(String str) {
		System.out.println(" method2");
	}
	
	
	

	public static void main(String[] args) {
		
		Interview_Dummy_practice objvalue=new Interview_Dummy_practice();
		//Java always prefers the more specific overloaded method.
		objvalue.method(null);
		
	//	1. can u swap it two variable without using  third variable
		
		int a=1000;
		int b=2000;
		
		a=a+b;//a=3000
		
		b=a-b;
		a=a-b;//b=1000 updated value
		
		System.out.println("a : "  +a ); 
		System.out.println(" b : " + b);
		
		
		
		//2.  Exception handling in try catch flow
		
		try {
			int x=10;
			int y=0;
		    int z=	x/y;
			
		}
		
		catch (ArithmeticException ae) {
			System.out.println("ArithmeticException  --------------------- ");
		}
		
		catch (Exception e) {
			System.out.println("Exception");
		}
		
		
		
		//3.  
		
		
		  
		     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
