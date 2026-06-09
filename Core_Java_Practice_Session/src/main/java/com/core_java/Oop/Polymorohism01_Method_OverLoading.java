package com.core_java.Oop;



class A1{
	
	public int m1(int a,int b) {
		int c=a*b;
		return c;
		
	}	
	
	
public int m1(int a,int b,int c) {
	int addition=a+b+c;
	
	return addition;
	
		
	}   
	
	
}
 


public class Polymorohism01_Method_OverLoading extends A1 {
	public static void main(String[] args) {
		
		Polymorohism01_Method_OverLoading polm=new Polymorohism01_Method_OverLoading();
		int khushi = polm.m1(2, 15);
		System.out.println(khushi);
		System.out.println("-------------------------");
	int value=polm.m1(5, 6, 9);
	System.out.println(value);
	}
}
