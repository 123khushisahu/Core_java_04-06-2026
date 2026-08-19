package com.hksir11am;

public class Constructor {
static int a=10;
static {
	System.out.println("from static block");
	System.out.println("a:"+a);
	//System.out.println("b:"+b);
	System.out.println("b:"+Constructor.b);
	b=50;
	System.out.println("b:"+Constructor.b);
}
	public static void main(String[] args) {
		System.out.println("\nFrom MM");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("b:"+Constructor.b);
	}
	static int b=6;

}
