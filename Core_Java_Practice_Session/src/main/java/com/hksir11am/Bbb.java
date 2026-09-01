package com.hksir11am;

public class Bbb extends Aaa {

	static int b = m6();
	int x = m7();


	static int m6(){
		System.out.println("B SV");
		return 20;
	}

	static int m7(){
		System.out.println("B NSV");
		return 20;
	}

	static{
		System.out.println("B SB");
	}
	
	{
		System.out.println("B NSB");
	}

	Bbb(){
		System.out.println("B NPC");
	}


	public static void main(String[] args) {
		System.out.println("B main");
		Bbb b1 = new Bbb();

		b1.m3();
		b1.m4();
		b1.m5();
		b1.m8();
	}

	static void m3(){
		System.out.println("B SM");
	}

	void m4(){
		System.out.println("B NSM");
	}
	
	void m8(){
		System.out.println("B m8");
	}
}
