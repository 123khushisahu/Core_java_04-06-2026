package com.core_java.Oop;
class A{
	static void show() {
		System.out.println("A class");
	}
}
class B extends A{
	static 
	
	void show() {		System.out.println("B class");
	}
}
public class Poly {
public static void main(String[] args) {
	A a=new B();
	a.show();
}
}
