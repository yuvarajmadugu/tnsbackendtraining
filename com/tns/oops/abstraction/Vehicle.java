package com.tns.oops.abstraction;

abstract class Vehicle {
    //Abstract Definition: Hiding complex details and accessing only essential features:
    //Achieved using Abstract Classes and Interfaces
    //An abstract class in Java is a class that cannot be instantiated directly (you cannot create objects of it).
    //It may contain:
    //Abstract methods (methods without implementation — just declared).
    //Concrete methods (methods with implementation).
    //Abstract classes are meant to be inherited (extended) by child classes. only child classes provide implementation
    //If a class has even one abstract method, the class must be abstract.

    abstract void start();
    //here any subclasses inheriting Vehicle class must implement void start method becoz its abstract

    // normal method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}
//subclasses - inheritance(Hierarchical Inheritance → One parent → Many children)
class Car extends Vehicle {
    @Override //abstract method
    void start() {
        System.out.println("Car starts with key.");
    }
}

class Bike extends Vehicle {
    @Override //abstract method
    void start() {
        System.out.println("Bike starts with self-start button.");
    }

    @Override //concrete method
    void stop(){
        System.out.println("Bike Stopped");
    }
}


