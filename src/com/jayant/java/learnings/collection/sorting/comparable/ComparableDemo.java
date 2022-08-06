package com.jayant.java.learnings.collection.sorting.comparable;

// Comparable interface is present in java.lang package.
// Comparable interface contain a single method called compareTo() method.
// public int compareTo(Object obj1, Object obj2)

public class ComparableDemo {
    public static void main(String[] args) {
        System.out.println("a".compareTo("z"));// returns -ve integer
        System.out.println("z".compareTo("l")); // returns +ve integer
        System.out.println(new Integer(1).compareTo(new Integer(1)));// should return 0
        System.out.println(new Integer(1).compareTo(1));
//        System.out.println("a".compareTo(null)); // java.lang.NullPointerException

    }
}
