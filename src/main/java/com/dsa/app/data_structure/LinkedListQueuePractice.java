package com.dsa.app.data_structure;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueuePractice {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("1");
        q.add("2");
        q.add("3");
        q.add("4");

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);

    }
}
