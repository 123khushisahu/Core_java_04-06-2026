package com.hksir11am;
class Sample{
	static int a=10;
	static {
		System.out.println("this is static block");
	}
}
public class Test {

	public static void main(String[] args) {
System.out.println(Sample.a);
	}

}
