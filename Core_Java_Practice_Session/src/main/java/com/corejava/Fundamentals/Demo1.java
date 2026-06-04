package com.corejava.Fundamentals;

public class Demo1 {

	
	public  void main1(String args) {
		System.out.println("this is the custom methods");
	}
	
	
	
	public static void main(String[]args) {
	System.out.println("Hello");
	
	//Demo1.main1("King");
	Demo1 obj=new Demo1();
	obj.main1("vijay");
	
	
	System.out.println("-----------------------------");
	
	
	// Q.1 print two number of sum
	int a=20;
	int b=40;
	int c=a%b;
	System.out.println("this is the c value : " +c);
	
	
    int m1=18;
    int m2=20;
    int m3=18;
    
    if (m1==m2 && m1==m3 ) {
    	System.out.println("this is the if block true area");
		
	}
    
    else {
    	System.out.println("this is the else block false area");
    }
    
    
    
    
    
    
    
    
    
    if (m1==m2 || m1==m3 ) {
    	System.out.println("this is the if block true area");
		
	}
    
    else {
    	System.out.println("this is the else block false area");
    }
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

	
	
	



	

}




