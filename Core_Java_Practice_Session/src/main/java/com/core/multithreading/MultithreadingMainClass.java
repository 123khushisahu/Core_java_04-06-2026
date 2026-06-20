package com.core.multithreading;

public class MultithreadingMainClass {

	public static void main(String[] args) {
		MultithreadingChildClass t=new MultithreadingChildClass();
		t.run();
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread:"+i);
		}
	}

}
