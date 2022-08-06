package com.jayant.java.learnings.collection.set;

import java.util.HashSet;
// Duplicates are not allowed and insertion order is not preserved as it's based on the hashtable;
// Best Choice if Search is the frequent operation
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("a");
        hs.add("z");
        hs.add("a");
        hs.add(null);
        hs.add(false);
        System.out.println(hs);
    }
}
