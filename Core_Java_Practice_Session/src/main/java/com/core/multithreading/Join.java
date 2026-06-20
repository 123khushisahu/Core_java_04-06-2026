package com.core.multithreading;

public class Join extends Thread {
	//c m
	public void m1()  {
		int i;
		for(i=1;i<=5;i++) {
			System.out.println("this is my run methods ..");
		} //for close 
		
	}   // methods close 

	public static void main(String[] args) throws Exception {
		
		//Interview Questions
		//Q1. What is join()?

		//join() is used to make one thread wait for 
		//another thread to finish.
		
		
		
		
	try {
		Join j=new Join();
		j.start();
		j.m1();
		j.join();
        System.out.println("Main Thread Finished");
	}
	catch (Exception e) {
		e.printStackTrace();
		throw  new Exception("this is custom exeption");
	}
		
		
		
		
	
		

	}

}
