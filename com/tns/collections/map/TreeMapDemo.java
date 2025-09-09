package com.tns.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> tm = new TreeMap<String, Integer>();
        //Treemap follows natural ordering:

        tm.put("BMW", 2006);
        tm.put("Tata", 1980);
        tm.put("RR", 2008);

        //iterate
        for(Map.Entry<String, Integer> ans:tm.entrySet()) {
            String key = ans.getKey();
            int value = ans.getValue();
            System.out.println(key + " " + value);
        }
    }
}
