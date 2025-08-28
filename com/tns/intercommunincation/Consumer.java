package com.tns.threads.intercommunincation;

public class Consumer extends Thread{
    private SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) { // Consuming 5 items
            resource.consumer();
//            try {
//                Thread.sleep(800); // Simulate time to consume
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
