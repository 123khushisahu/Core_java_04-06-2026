package com.hksir11am;

public class Aaa {
	static int a = m1();
	int x = m2();

	static int m1(){
		System.out.println("A SV");
		return 10;
	}

	int m2(){
		System.out.println("A NSV");
		return 30;
	}

	static{
		System.out.println("A SB");
	}

	{
		System.out.println("A NSB");
	}

	Aaa(){
		System.out.println("A NPC");
	}

	public static void main(String[] args){
		System.out.println("A main");
	}

	static void m3(){
		System.out.println("A SM");
	}

	void m4(){
		System.out.println("A NSM");
	}

	void m5(){
		System.out.println("A m5");
	}

}
