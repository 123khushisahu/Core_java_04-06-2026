package com.core.multithreading;

public class Intro_And_Basic {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	/*	Multithreading Java Developer ke liye bahut important topic hai. 
	 * Chaliye basic se start karte hain.
	 

		1. Multithreading Kya Hai?

		Multithreading ek process ke andar multiple threads ko ek saath 
		execute karne ki technique hai.

		Real-Life Example

		Socho aap mobile me:

		Music sun rahe ho 🎵
		WhatsApp use kar rahe ho 💬
		File download ho rahi hai 📥

		Ye sab alag-alag threads ki wajah se possible hota hai.  
		
		
		2. Thread Kya Hai?

	     Thread ek lightweight sub-process hai.  */
		
		  //Thread class all methods are below
		
/*		| Method          | Use                   |
		| --------------- | --------------------- |
		| start()         | Thread start          |
		| run()           | Task execution        |
		| sleep()         | Pause thread          |
		| join()          | Wait for thread       |
		| yield()         | Give chance to others |
		| currentThread() | Current thread        |
		| isAlive()       | Check running         |
		| interrupt()     | Interrupt thread      |
		| setPriority()   | Set priority          |
		| getState()      | Current state         |
		
		*
| Feature       | sleep()                                 | join()                                      |
| ------------- | --------------------------------------- | ------------------------------------------- |
| Purpose       | Thread ko kuch time ke liye pause karna | Dusre thread ke complete hone ka wait karna |
| Wait Kisliye? | Fixed time ke liye                      | Thread completion ke liye                   |
| Method Type   | Static Method                           | Instance Method                             |
| Belongs To    | `Thread.sleep()`                        | `t1.join()`                                 |
| Lock Release  | Nahi karta                              | Nahi karta                                  |
| Exception     | `InterruptedException`                  | `InterruptedException`                      |

		*
		*/
		
		
		

		
		System.out.println("TASK-1");
		System.out.println("TASK-2");
		System.out.println("TASK-3");
		System.out.println("TASK-4");
		
		MyThreadd t=new MyThreadd();
		t.start();
		t.run();
		t.sleep(5000);
		System.out.println("this is the multi threading methods.........");
		
	     
	     
	     
		
		
		
		
	}

}
