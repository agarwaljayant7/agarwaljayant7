package com.jayant.java.learnings.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add("R");
        l.add(10);
        l.add(null);
        l.addFirst("Z");
        l.addLast(false);
        l.remove(3);
        l.removeFirst();
        System.out.println(l);
    }
}
