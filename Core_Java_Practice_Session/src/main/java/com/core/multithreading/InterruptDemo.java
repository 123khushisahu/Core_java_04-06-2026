package com.core.multithreading;

class MyThread123 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Child Thread Started...");

            System.out.println("Child Thread Sleeping...");
            Thread.sleep(5000);

            System.out.println("Child Thread Completed...");
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted...");
        }
    }
}

public class InterruptDemo {

    public static void main(String[] args) throws InterruptedException {

        MyThread123 t = new MyThread123();

        t.start();

        System.out.println("Main Thread Started...");

        Thread.sleep(2000);

        System.out.println("Main Thread Interrupting Child Thread...");

       

        System.out.println("Main Thread Finished...");
    }
}