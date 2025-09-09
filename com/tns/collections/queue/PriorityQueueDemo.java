package com.tns.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    //in priority queue lowest are given highest priority only at the beginning
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(2);
        pq.add(3);
        pq.add(34);

        for (int ans:pq){
            System.out.println(ans);
        }
    }
}
