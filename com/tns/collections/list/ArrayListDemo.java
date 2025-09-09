package com.tns.collections.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList(); //no typesafe(generics), allows all types of data
        a1.add(10);
        a1.add("Hi");
        a1.add("Hi"); //duplicate
        a1.add(""); //null
        a1.add(2.0);
        System.out.println(a1);
    }
}
