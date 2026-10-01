package com.hksir11am;

public class DoubleEqualsMethod {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1 == s2); // true, because both refer to the same string literal in the string pool
	
		System.out.println(s1.equals(s2)); // true, because the content of both strings is the same
	
		String s3=new String("java");
		String s4=new String("java");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	
	
	}
	

}
