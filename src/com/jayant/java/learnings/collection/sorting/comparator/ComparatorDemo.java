package com.jayant.java.learnings.collection.sorting.comparator;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                if(i1 < i2){
                    return 1;
                }
                else if (i1 > i2){
                    return -1;
                }
                else if (i1 == i2) {
                    return 0;
                }
                return 0;
            };
        });

        ss.add(10);
        ss.add(-10);
        ss.add(0);
        ss.add(100);
        ss.add(-1000);
        ss.add(1000);

        System.out.println(ss);
    }
}
