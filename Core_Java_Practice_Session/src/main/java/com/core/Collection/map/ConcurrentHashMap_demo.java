package com.core.Collection.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_demo {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
               

        Thread t1 = new Thread(() -> {
            map.put(1, "Ram");
            System.out.println("Thread-1 : " + map);
        });

        Thread t2 = new Thread(() -> {
            map.put(2, "Shyam");
            System.out.println("Thread-2 : " + map);
        });

        Thread t3 = new Thread(() -> {
            map.put(3, "Mohan");
            System.out.println("Thread-3 : " + map);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}

