package com.tns.functionalinterface;

public class TraditionalImplementation implements MyFunctionalInterface{
    @Override
    public void displayMsg(String msg){
        System.out.println("Tradition Implementation: " +msg);
    }

    public static void main(String[] args) {
        MyFunctionalInterface t1 = new TraditionalImplementation();
        t1.displayMsg("Hello from Traditional class!");
    }
}
