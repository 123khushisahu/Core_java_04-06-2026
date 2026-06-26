package com.core.multithreading;

class MyThread extends MyThreadd{
	
	
	// thread methods
    @Override
	public void run() {
		System.out.println("this is the run methods...");
		
	}
	//custom methods
//	public void m1() {
//		
//		System.out.println("this is the m1 methods...");
//		
//	}
}
public class Demo {
	
	public static void main(String[] args) {
		
		MyThreadd mythread=new MyThreadd();
		mythread.start();
		
		//mythread.m1();
	}

}
