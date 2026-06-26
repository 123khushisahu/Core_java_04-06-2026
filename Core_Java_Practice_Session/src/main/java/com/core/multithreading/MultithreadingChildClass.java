package com.core.multithreading;

public class MultithreadingChildClass extends MyThreadd {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread:"+i);
		}
	}

}
