package com.core.multithreading;
class MyTask implements Runnable{

	@Override
	public void run() {
System.out.println("task running");		
	}
	
}
public class Runnablehk {
public static void main(String[] args) {
	MyTask task=new MyTask();
	Thread t=new Thread(task);
	t.start();
}
}
