package com.tns.oops.polymorphism.methodoverloading;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (2 args): " + calc.add(10, 20));
        System.out.println("Sum (3 args): " + calc.add(10, 20, 30));
    }
}
