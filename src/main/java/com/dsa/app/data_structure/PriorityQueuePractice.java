package com.dsa.app.data_structure;

import com.dsa.app.objects.Person;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(4);
        p.add(1);
        p.add(20);
        p.add(-2);

        // p -> [-2, 1, 20, 4]
        System.out.println(p); // [1, 2, 3, 4]


        p.remove();
        p.remove();
        // p -> [4, 20]
        System.out.println(p); // [3, 4]

        PriorityQueue<Person> personQueue = new PriorityQueue<>();

        final Person p1 = new Person("1", "1", 1);
        final Person p2 = new Person("1", "1", 2);
        final Person p3 = new Person("1", "1", 10);
        final Person p4 = new Person("1", "1", -2);


        personQueue.add(p1);
        personQueue.add(p2);
        personQueue.add(p3);
        personQueue.add(p4);
        System.out.println(personQueue);
    }
}
