package com.tns.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
    //set = unordered, no duplicates
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        s1.add("X");
        s1.add("Y");
        s1.add("z");
//        System.out.println(s1);
        for (String ans: s1){
            System.out.println(ans);
        }
    }
}
