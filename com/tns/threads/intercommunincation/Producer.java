package com.tns.threads.intercommunincation;

public class Producer extends Thread{
    private SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) { // Producing 5 items
            resource.producer(i);
//            try {
//                Thread.sleep(500); // Simulate time to produce
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
