package com.tns.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(89);
        q.add(8);
        q.add(7);
        q.add(90);

        System.out.println(q);
    }
}
