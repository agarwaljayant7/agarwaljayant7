package com.jayant.java.learnings.collection.set;

import java.util.LinkedHashSet;

// the underlying data structure is linked list and hash table.
// Duplicates are not allowed and insertion order is preserved.
// used to generally develop cache based applications where duplicates are not allowed and insertion order is
// preserved
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(10);
        lhs.add("10");
        lhs.add("a");
        lhs.add(null);
        lhs.add("a");
        lhs.add(false);
        lhs.add(true);
        System.out.println(lhs);
    }
}
