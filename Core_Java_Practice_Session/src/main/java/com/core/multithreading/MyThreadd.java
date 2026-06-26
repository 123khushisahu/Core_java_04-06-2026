package com.core.multithreading;

public class MyThreadd extends Thread {
	@Override
	public void run() {
		//System.out.println("hellooooo");
		for(int i=1;i<=20;i++) {
			System.out.println("hello");
		}	
	}

public static void main(String[] args) throws Exception  {
	
	try {
		MyThreadd obj=new MyThreadd() ;
		obj.run();
		//obj.run();
		for(int i=1;i<=20;i++) {
			System.out.println("hii");
		}
	}  //try close 
	catch (Exception e) {
		e.printStackTrace();
		throw new ArithmeticException("ArithmeticException");
	}
	
		
}
}
