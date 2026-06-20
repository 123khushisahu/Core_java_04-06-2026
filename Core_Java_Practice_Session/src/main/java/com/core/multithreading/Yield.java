package com.core.multithreading;

class ThreadDummy extends Thread {
	
public String m1() {
	
	for(int i=1; i<=5;i++) {
		System.out.println("this is the current thread : " +Thread.currentThread());
		
		Thread.yield();
	}
	
	return " My India is Great";
	
	
	
}
	
}




public class Yield {

	public static void main(String[] args) {
		
		
		ThreadDummy threaddummy=new ThreadDummy();
		threaddummy.m1();
		
		System.out.println("main method");
		
		/*yield() Method in Java
		Definition

		yield() method current running thread ko bolta hai:

		"Agar koi aur same ya higher priority thread wait kar raha hai, to usko CPU de sakte ho."

		Lekin JVM ki marzi hoti hai ki wo request maane ya ignore kare. 
		*/
		
		
		//syntax:
        Thread.yield();
        
        
        //yield() ek static method hai.
        
       // Real-Life Example

		/*
		 * Socho 2 log ek computer use kar rahe hain.
		 * 
		 * Pehla banda bolta hai:
		 * 
		 * "Main thoda rukta hoon, tum kaam kar lo."
		 * 
		 * Yahi concept yield() ka hai.
		 * 
		 * 
		
        
        | yield()                       | sleep()                           |
        | ----------------------------- | --------------------------------- |
        | CPU dene ki request karta hai | Fixed time ke liye stop karta hai |
        | Wait time fix nahi            | Wait time fix hota hai            |
        | JVM ignore bhi kar sakti hai  | JVM ko wait karna padta hai       |
        | Static Method                 | Static Method                     |

		
		 */
		
	}

}
