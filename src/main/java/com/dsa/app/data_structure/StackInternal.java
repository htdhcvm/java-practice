package com.dsa.app.data_structure;

import java.util.Stack;

public class StackInternal {
    public static void main(String[] args) {
        Stack<String> stString = new Stack<>();
        stString.push("1");
        stString.push("2");
        stString.push("3");

        System.out.println(stString.peek());
        System.out.println(stString.peek());
        stString.pop();
        System.out.println(stString.peek());
    }
}
