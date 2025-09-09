package com.tns.collections.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);

        ll.addFirst(90);
        ll.addLast(100);

        System.out.println(ll);
    }
}
