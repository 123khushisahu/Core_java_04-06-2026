package com.core_java.Oop;

class A{
	public void show() {
		System.out.println("this is the show methods...");
	}
	
}

class B extends  A{
	
	
}

class C extends A{
	
	
}







public class Test extends C {

	public static void main(String[] args) {
		
		Encapsulation_example en=new Encapsulation_example();
		
		
		
		Test t=new Test();
		t.show();

	}

}
