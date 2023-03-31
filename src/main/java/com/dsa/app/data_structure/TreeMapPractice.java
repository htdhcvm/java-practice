package com.dsa.app.data_structure;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        TreeMap<Double, String> m = new TreeMap<>();
        m.put(12.2, "1");
        m.put(10.2, "2");
        m.put(14.2, "3");
        m.put(15.2, "4");
        m.put(18.2, "5");
        m.put(120.2, "6");

        System.out.println(m);
        System.out.println(m.get(120.2));
        System.out.println(m.remove(120.2));
        System.out.println(m);
        Map<Double, String> q = m.descendingMap();
        q.put(10.22, "123");
        System.out.println(m);
        System.out.println(q);

        m.put(120.2, "6");

        System.out.println("tailMap: " + m.tailMap(18.2));
        System.out.println("headMap: " + m.headMap(18.2));


        var last = m.lastEntry();
        var first = m.firstEntry();
        System.out.println(first);
        System.out.println(last);

        System.out.println(m);
    }
}
