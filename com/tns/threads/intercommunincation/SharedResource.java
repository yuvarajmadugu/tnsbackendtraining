package com.tns.threads.intercommunincation;

public class SharedResource {
    private int data;
    private boolean dataAvailable = false;

    public synchronized void producer(int value){
        // Producer puts data
        while (dataAvailable) {
            // If already produced, wait for consumer
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Producer produced: " + data);
        dataAvailable = true;

        // Notify consumer that data is ready
        notify();

    }

    public synchronized void consumer(){
        while (!dataAvailable) {
            // If nothing produced yet, wait for producer
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumer consumed: " + data);
        dataAvailable = false;

        // Notify producer to produce next
        notify();
//        return data;
    }


}
