package com.hksir11am;

class Demo {

    static int a = 10;

    static {
        System.out.println("SB1");
    }

    static int b = 20;

    static {
        System.out.println("SB2");
    }

    int c = 30;

    {
        System.out.println("IB");
    }

    Demo() {
        System.out.println("Constructor");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }

    void memberMethod() {
        System.out.println("Member Method");
    }

    public static void main(String[] args) {

        System.out.println("main");

        staticMethod();

        Demo d = new Demo();

        d.memberMethod();
    }
}