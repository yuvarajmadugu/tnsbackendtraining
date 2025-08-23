package com.tns.oops.inheritance.multipleInheritance;

public interface Petrol {
    default void drive(){
        System.out.println("Driving using Petrol");
    }
}
