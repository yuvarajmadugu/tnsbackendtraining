package com.tns.oops.abstraction;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();

        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();
    }
}
