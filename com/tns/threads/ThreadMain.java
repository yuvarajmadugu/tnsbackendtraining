package com.tns.threads;

public class ThreadMain {
    public static void main(String[] args) {
        
        UsageThread ob = new UsageThread();

        Thread t1 = new Thread(){
            public void run(){
                ob.mul(5);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                ob.mul(9);
            }
        };

        t1.start();
        t2.start();
    }
}

