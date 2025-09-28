package com.tns.functionalinterface;

@FunctionalInterface

//A Functional Interface is an interface with exactly one abstract method (SAM).
//Can have multiple default or static methods.
//Annotated with @FunctionalInterface for clarity.

public interface MyFunctionalInterface {
    void displayMsg(String msg);
}
