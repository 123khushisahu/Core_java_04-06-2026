package com.hksir11am;



class A08 {
	static void m1(){ 
		System.out.println("A m1");
	}
}
class B extends A08 {
	static void m1(){ 
		System.out.println("B m1");
	}

}
class C extends B099 {
	static void m1(){ 
		System.out.println("C m1");
	}

}
class D extends C {
	static void m1(){ 
		System.out.println("D m1");
	}
}

public class Poly {
	public static void main(String[] args) {
		A08 a1;
		
		a1 = new A08();
		a1.m1();
		
		a1 = new B099();
		a1.m1();
		
		a1 = new C();
		a1.m1();
		
		a1 = new D();
		a1.m1();

		
	}
}

