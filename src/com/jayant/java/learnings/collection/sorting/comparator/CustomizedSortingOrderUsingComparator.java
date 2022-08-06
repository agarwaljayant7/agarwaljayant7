package com.jayant.java.learnings.collection.sorting.comparator;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

// Various possible implementation of Comparator interface
// Descending order
public class CustomizedSortingOrderUsingComparator {
    public static void main(String[] args) {
        SortedSet s = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               String s1 = (String) o1;
               String s2 = (String) o2;
                return -s1.compareTo(s2);
//                return s2.compareTo(s1);
//                return -1;  // according to insertion order
//                return -1;  // reverse of insertion order
//                return 0;   // only first element will be printed , rest all are considered duplicates
            };
        });
        s.add("a");
        s.add("b");
        s.add("ab");
        s.add("ba");
        s.add("c");
        s.add("ca");
        s.add("z");
        s.add("aa");

        System.out.println(s);
    }
}
