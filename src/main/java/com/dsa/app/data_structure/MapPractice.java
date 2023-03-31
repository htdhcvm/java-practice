package com.dsa.app.data_structure;


import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(123, "123");
        m.put(321, null);


        System.out.println(m.get(123));
        System.out.println(m.get(321));
        System.out.println(m.get(3213));

        m.containsValue("123");
        m.keySet();
    }
}
