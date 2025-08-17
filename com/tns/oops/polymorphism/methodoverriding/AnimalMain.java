package com.tns.oops.polymorphism.methodoverriding;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // reference of parent, object of child
        a1.sound(); //runtime polymorphism → Dog's method runs
    }
}
