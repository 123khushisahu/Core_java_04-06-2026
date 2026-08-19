package com.hksir11am;
class Example {
    int x = 10;

    void m1(int p) {
        p = 50;
    }

    void m2(AdditionReturnWithThrow e) {
        e = new AdditionReturnWithThrow();
    }

    void m3(AdditionReturnWithThrow e) {
        e.x = 15;
    }

    void m4(AdditionReturnWithThrow e) {
        e = new AdditionReturnWithThrow();
        e.x = 16;
    }

    void m5(AdditionReturnWithThrow e) {
        e.x = 19;
        e = new AdditionReturnWithThrow();
        e.x = 20;
    }
}
public class Method1 {

    public static void main(String[] args) {

        AdditionReturnWithThrow e1 = new AdditionReturnWithThrow();

        int q = 18;
        System.out.println("b m1 q: " + q);
        e1.m1(q);
        System.out.println("a m1 q: " + q);

        AdditionReturnWithThrow e2 = new AdditionReturnWithThrow();
        System.out.println("b m2 e2.x: " + e2.x);
        e1.m2(e2);
        System.out.println("a m2 e2.x: " + e2.x);

        System.out.println("b m3 e2.x: " + e2.x);
        e1.m3(e2);
        System.out.println("a m3 e2.x: " + e2.x);

        System.out.println("b m4 e2.x: " + e2.x);
        e1.m4(e2);
        System.out.println("a m4 e2.x: " + e2.x);

        System.out.println("b m5 e2.x: " + e2.x);
        e1.m5(e2);
        System.out.println("a m5 e2.x: " + e2.x);
    }





	}


