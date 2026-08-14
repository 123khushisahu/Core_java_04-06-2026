package com.hksir11am;
//swap number without using third variable
public class SwappingNumber {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a= "+a+" b= "+b);
	}

}
