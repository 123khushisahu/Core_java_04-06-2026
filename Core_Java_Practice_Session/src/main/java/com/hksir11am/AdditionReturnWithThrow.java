package com.hksir11am;

public class AdditionReturnWithThrow {
public static int add(int a,int b) {
	if(a<0||b<0) {
		throw new IllegalArgumentException("Do not pass negative number.");
	}
	return a+b;
	
}
	public static void main(String[] args) {
	int result=add(10,20);
	System.out.println("Result:"+result);
	}

}
