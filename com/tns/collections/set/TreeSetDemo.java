package com.tns.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    //set = unordered, no duplicates

    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("x");
        ts.add("y");
        ts.add("z");

        System.out.println(ts);
    }
}
