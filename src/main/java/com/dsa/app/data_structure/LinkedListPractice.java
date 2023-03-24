package com.dsa.app.data_structure;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("str");
        l.add("str");
        l.add(2, "str");

        System.out.println(l);
    }
}
