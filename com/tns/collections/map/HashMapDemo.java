package com.tns.collections.map;

import java.util.HashMap;
import java.util.Map;
//Map interface has --> LinkedHashMap, TreeMap, HashMap, HashTable
public class HashMapDemo {
    //Map are used when there is key-value pair
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();

        //to add elements in the map --> put() is used
        //HashMap doesnot follow order RR may be first or could be anything
        hm.put("BMW", 2006);
        hm.put("Tata", 1980);
        hm.put("RR", 2008);

        //iterate
        //foreach loop for map: having few additional methods:
        for(Map.Entry<String, Integer> ans:hm.entrySet()) {
            String key = ans.getKey();
            int value = ans.getValue();
            System.out.println(key + " " + value);
        }
    }
}
