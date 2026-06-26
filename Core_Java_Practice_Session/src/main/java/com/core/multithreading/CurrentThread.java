package com.core.multithreading;

public class CurrentThread {

	
	public static void main(String[] args) {
		
		
		//ArrayList<Integer> array=new ArrayList<>();
		//System.out.println("new created array list size :  " +array.size());
	
		// array.add(221303);
		// System.out.println("after added one element size become :  " +array.size());
		
		
		MyThreadd.startVirtualThread(()->System.out.println("this is the virtual"));
		MyThreadd.currentThread().setName("this is the khushi ");
		System.out.println(MyThreadd.currentThread().getId() 
				+ ' ' + MyThreadd.currentThread().getName());
		
		MyThreadd.currentThread().setName("Vijay bahadur");
		
		for(int a=20; a>=15; a--) {
			System.out.println(MyThreadd.currentThread().getName() + "       " + a);
		
		
	}

}
}