package com.core.multithreading;

import java.util.Scanner;

public class Examplehk {
	
	public static void main(String[] args) {
		System.out.println("Test main start");
		Test01.m1();
		Test01.m2();
		Test01.m3();
		System.out.println("Test main end");
		
	
}

}

class Test01{

public static void m1() {
	System.out.println("m1 execution start");
	System.out.println("m1 execution end");
}
public static void m2() {
	System.out.println("\nm2 execution start");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name:");
	String name=sc.nextLine();
	System.out.println("m2 execution end:");
}
public static void m3() {
	System.out.println("\nm3 execution start ");
	System.out.println("\nm3 execution end ");
}
}