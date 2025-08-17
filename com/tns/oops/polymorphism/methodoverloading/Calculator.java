package com.tns.oops.polymorphism.methodoverloading;

//OverLoading is known as Compile Time Polymorphism
public class Calculator {
    // Method Overloading (Compile-time Polymorphism)
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
