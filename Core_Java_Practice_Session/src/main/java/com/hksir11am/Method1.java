package com.hksir11am;
class Example {
    int x = 10;

    void m1(int p) {
        p = 50;
    }

    void m2(Example e) {
        e = new Example();
    }

    void m3(Example e) {
        e.x = 15;
    }

    void m4(Example e) {
        e = new Example();
        e.x = 16;
    }

    void m5(Example e) {
        e.x = 19;
        e = new Example();
        e.x = 20;
    }
}
public class Method1 {

    public static void main(String[] args) {

        Example e1 = new Example();

        int q = 18;
        System.out.println("b m1 q: " + q);
        e1.m1(q);
        System.out.println("a m1 q: " + q);

        Example e2 = new Example();
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


