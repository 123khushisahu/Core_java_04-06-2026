package com.hksir11am;




/*
	Below program explains reading and modifying SV and LV with VS
*/
public class VariableShadowing2 {
	static int a = 10;

	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(VariableShadowing2.a);
		System.out.println();

		int  a = 50;
		System.out.println(a);
		System.out.println(VariableShadowing2.a);
		System.out.println();

		a = 60;
		System.out.println(a);
		System.out.println(VariableShadowing2.a);
		System.out.println();

		VariableShadowing2.a = 70;
		System.out.println(a);
		System.out.println(VariableShadowing2.a);
		System.out.println();

		int b = 90;
		System.out.println(b);
		//System.out.println(VariableShadowing2.b);

//		c = 90;
//		System.out.println(c);
//		System.out.println(VariableShadowing2.c);
/**/
	}
}

