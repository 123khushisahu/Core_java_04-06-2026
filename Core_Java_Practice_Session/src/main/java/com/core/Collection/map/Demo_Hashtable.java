package com.core.Collection.map;

import java.util.Hashtable;

/*	
Hashtable Features
✅ Stores data as Key → Value
✅ Thread-safe (methods are synchronized)
❌ Does not maintain insertion order
❌ Does not allow null key
❌ Does not allow null value
✅ Keys are unique
✅ Values can be duplicate


*/



class Table {

    synchronized void printTable(int n) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class MyThread1 extends Thread {

    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {

    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

   
    
    public void run() {
        t.printTable(100);
    }
}

public class Demo_Hashtable {

    public static void main(String[] args) {

        Table obj = new Table();

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
