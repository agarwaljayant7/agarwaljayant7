package com.jayant.java.learnings.collection.sorting.comparator;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// Storing heterogeneous objects in TreeSet but by using CustomizedSortingOrder by using Comparator interface.
public class CustomizedSortingOrderUsingComparatorAndStringBufferClass {
    public static void main(String[] args) {

        Set s = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               String s1 = o1.toString();
               String s2 = o2.toString();
               return s1.compareTo(s2);
            }
        });
        s.add(new StringBuffer("z"));
        s.add(new StringBuffer("y"));
        s.add(new StringBuffer("a"));
        s.add(new StringBuffer("aa"));
        s.add(new StringBuffer("c"));
        s.add(new StringBuffer("10"));
        s.add(true);
//        s.add(null);  // null insertion is not possible from jdk 1.7 version onwards.
        System.out.println(s);
    }
}
