package com.core.Statements;

public class Iteration_Statement {

	public static void main(String[] args) {//args vari
		int sum=0;
		
		/*Interview Answer
		How many types of loops are there in Java?

		Java has 4 types of loops:

		for loop
		while loop
		do-while loop
		 for-each loop
		*/
		
		for(int i=10;i>=0;i--)	{
			System.out.println(i);
	}
		
		for (int i = 1;i<=20; i++) {
		    if (i % 2 == 0) {
	        System.out.println(i);
		    }
//		    for(int j=1;j<=50;j++) {
//		    	if(j%3==0) {
//		    		System.out.println(j);
//		    	}
//		    }
		   
		    for(int x=1;x<=5;++x) {
		    	System.out.println(x);
	   
//		for(int i=2;i<=20;i++) {
//			if(i%2==0) {
//			System.out.println(i);
//			
//			
//		}
//			for(int s=1;s<=20;s++) {
//				if(s%2!=0) {
//					System.out.println(s);
//				}
//				
//		}
//			for(int z=1;z<=100;z++) {
//				sum=sum+z;
//				System.out.println("Addition is :"+sum);
//
//			}
	
		    /*while loop
		    int i=1;
		    while(i<=3) {
		    	System.out.println(i);
		    	i++;
		    }
		    int j=2;
		    while(j<=10) {
		    	System.out.println(j);
		    	j=j+2;
		    }
		    */
		    
		    //do-while Loop
		   /* int k=1;
		    do {
		    	System.out.println(k);
		    	k++;
		    }while(k<=6);
		   */ 
		
		
		//for-each Loop
		/*int[] arr= {10,20,30,40,50};
		for(int num:arr) {
			System.out.println(num);
			System.out.println(arr);
		}
		String[] names= {"khushi", "riya","ankit"};
		for(String name:names) {
			System.out.println(name);
		}
		*/
		
	}
	
			
	}
	}}



	


