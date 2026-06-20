package com.core.multithreading;

public class CurrentThread {

	
	public static void main(String[] args) {
		
		
		//ArrayList<Integer> array=new ArrayList<>();
		//System.out.println("new created array list size :  " +array.size());
	
		// array.add(221303);
		// System.out.println("after added one element size become :  " +array.size());
		
		
		Thread.startVirtualThread(()->System.out.println("this is the virtual"));
		Thread.currentThread().setName("this is the khushi ");
		System.out.println(Thread.currentThread().getId() 
				+ ' ' + Thread.currentThread().getName());
		
		Thread.currentThread().setName("Vijay bahadur");
		
		for(int a=20; a>=15; a--) {
			System.out.println(Thread.currentThread().getName() + "       " + a);
		
		
	}

}
}