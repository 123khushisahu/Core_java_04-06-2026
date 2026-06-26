package com.core.multithreading;

class Dummy implements Runnable{
	
	public void m1() {
		try {
			System.out.println("m1 methods ...");
			Thread.sleep(3000);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	} //m1 close 	
	
	
	 
	 public void run() {
	        try {
	            Thread.sleep(3000);
	        	
	        } catch (Exception e) {
	        }
	        System.out.println("Thread Work Completed");
	    }
	
	
	
	
	
	
	
	
	
	
	
	
} //class close 

/*

isAlive() Method in Java (Hindi)
Definition

isAlive() method check karta hai ki koi thread abhi bhi execute (run) ho raha hai ya nahi.

Ye method boolean value return karta hai:

true → Thread alive (running ya runnable state me hai)
false → Thread start nahi hua ya execution complete ho gaya
*/
public class IsAlive {

	public static void main(String[] args) {
		Dummy dummy=new Dummy();
		
		Thread t1=new Thread(dummy);
		System.out.println(t1.isAlive());
		t1.start();
		
		
		
		
		
		
		
		
		Thread t2=new Thread(dummy);
		t2.start();
		dummy.m1();
		try {
			t2.join(1000);
			System.out.println("this is join thread");
		}
		catch (Exception e) {
		}
		System.out.println(t2.isAlive());
		
		
	
		
	
		
	
		
		

	}

}
