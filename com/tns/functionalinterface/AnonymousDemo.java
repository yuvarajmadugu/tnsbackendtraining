package com.tns.functionalinterface;

public class AnonymousDemo {
    public static void main(String[] args) {
        MyFunctionalInterface obj = new MyFunctionalInterface() {
            @Override
            public void displayMsg(String msg) {
                System.out.println("Anonymous Class Implementation: " + msg);
            }
        };
        obj.displayMsg("Hello from Anonymous class!");
    }
}
