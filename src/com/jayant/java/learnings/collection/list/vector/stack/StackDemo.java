package com.jayant.java.learnings.collection.list.vector.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(10);
        s.add("R");
        s.add(null);
        s.add(10);
        System.out.println(s.search(10));
    }
}
