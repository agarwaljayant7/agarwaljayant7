package com.jayant.java.learnings.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet ss = new TreeSet();
        ss.add(1000);
        // ss.add(true); // heterogeneous objects are not allowed.

        ss.add(101);
        ss.add(104);
        ss.add(106);
        ss.add(110);
        ss.add(115);
        ss.add(120);
        try {
            ss.add(null);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        ss.add(101);
//        ss.add("a");

//        ss.add(false);

        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet(104));
        System.out.println(ss.tailSet(104));
        System.out.println(ss.subSet(104, 115));
        System.out.println(ss.comparator());

    }
}

