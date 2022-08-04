package com.jayant.java.learnings.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("S");
        al.add(10);
        al.add(null);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.add(2, "L");
        System.out.println(al);
        al.add("M");
        System.out.println(al);
    }
}
