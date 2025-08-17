package com.tns.oops.polymorphism.methodoverriding;

//overRiding known as Runtime Polymorphism (R-R)
public class Animal {
    void sound() {
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}
