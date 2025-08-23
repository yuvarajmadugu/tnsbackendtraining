package com.tns.oops.inheritance.multipleInheritance;

public class Vehicle implements CNG,Petrol{
    // Overriding drive() to resolve ambiguity
    @Override
    public void drive() {
        System.out.println("Driving Vehicle");
    }

    // Specific methods to explicitly use parent interface implementations
    public void driveWithPetrol() {
        Petrol.super.drive(); // explicitly call Petrol interface method
    }

    public void driveWithCNG() {
        CNG.super.drive(); // explicitly call CNG interface method
    }

    // Main Method
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();

        // Default overridden method
        v1.drive();

        // Explicit choices
        v1.driveWithPetrol();
        v1.driveWithCNG();
    }
}
