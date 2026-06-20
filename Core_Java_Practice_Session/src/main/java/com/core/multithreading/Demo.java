package com.core.multithreading;

class MyThread extends Thread{
	
	
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
		
		MyThread mythread=new MyThread();
		mythread.start();
		
		//mythread.m1();
	}

}
