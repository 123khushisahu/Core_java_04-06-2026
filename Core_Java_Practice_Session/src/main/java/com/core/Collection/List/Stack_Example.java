package com.core.Collection.List;

import java.util.Stack;

public class Stack_Example {

	
	public static void main(String[] args) {
		
	//	LIFO(last in first out)   follows stack
		
		
		
	/*
	 * A Stack is a linear data structure that stores elements in LIFO (Last In,
	 * First Out) order.
	 * 
	 * Push: A Push: B Push: C
	 * 
	 * Stack: ----- | C | ← Top | B | | A | -----
	 * 
	 * Pop → C Pop → B Pop → A
	 * 
	 */
		
		
		Stack<String> str=new Stack<>();
		
		//stack methods = push,pop,remove,peek
		
		//push
		str.push("vijay");
		str.push("ajay");
		str.push("sohan");
		System.out.println(str);
		
		
		//peek
		//The peek() method returns the top element of the stack without removing it.
		
		System.out.println(str.peek());
		
		//pop
		//The pop() method removes the top element from the stack and returns it.
		
	
		System.out.println(str.pop());
		
		//remove
		//Removes the element at the specified index.
		
		System.out.println(str.remove(0));
		System.out.println(str);
		
		
		
		
	
		
		
		
		
		
		

	}

}
