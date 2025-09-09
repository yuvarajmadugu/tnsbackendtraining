package com.tns.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    //iterator is used to iterate any type of data in the collection
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList(); //no typesafe(generics), allows all types of data
        a1.add(10);
        a1.add("Hi");
        a1.add("Hi"); //duplicate
        a1.add(""); //null
        a1.add(2.0);
        //using foreach loop we can not iterate all cause foreach allows only one type of data
        System.out.println(a1);


        Iterator itr = a1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
