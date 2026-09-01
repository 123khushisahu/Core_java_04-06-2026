package com.hksir11am;
class TestSVsuper{
	static int a=10;
	static {
		System.out.println("this is static block1");
	}
}

class TestSuperclass2 extends TestSVsuper{
	static int b=20;
	static {
		System.out.println("this is static block2");
	}
}
public class TestSV {
public static void main(String[] args) {
	TestSuperclass2 b;
	System.out.println(TestSuperclass2.a);
	System.out.println(TestSuperclass2.b);
	System.out.println(new TestSuperclass2().b);
	System.out.println(new TestSuperclass2().a);
}
}
