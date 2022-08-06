package com.jayant.java.learnings.collection.sorting.comparable;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparableDemoTreeSet {
    public static void main(String[] args) {
        SortedSet s = new TreeSet();
//        s.add("a");
        s.add(100);
        s.add(20);
        s.add(40);
        s.add(60);
        s.add(-20);
        s.add(-200);
        System.out.println(s);
    }
}
