package com.tns.collections.list;

import java.util.ArrayList;

public class ArrayListUsingGenerics {
    public static void main(String[] args) {
        //typesafe, restricts required datatype using wrapperclass generics 
        ArrayList<Integer> a2 = new ArrayList<>(); //no typesafe(generics), allows all types of data
        a2.add(10);
        a2.add(20);
        a2.add(30);
        System.out.println(a2);

        a2.remove(2);
        System.out.println(a2);
    }
}
