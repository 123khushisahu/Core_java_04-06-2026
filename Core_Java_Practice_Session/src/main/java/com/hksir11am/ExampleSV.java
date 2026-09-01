package com.hksir11am;

class A {
    static int a = 10;

    static {
        System.out.println("In A SB");
        System.out.println("a: " + a);
        // System.out.println("b: " + b);
        System.out.println("b: " + ExampleSV.b);
        System.out.println("b: " + ExampleSV.getB());
    }
}
public class ExampleSV extends Aa {
	static int b = 20;

    static {
        System.out.println("In B SB");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("b: " + getB());
    }

    static int getB() {
        return b;
    }

    public static void main(String[] args) {
        System.out.println("In B main");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }


	
	    	}

