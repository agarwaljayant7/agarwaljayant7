package com.jayant.java.learnings.collection.set;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("A");
        ts.add("a");
        ts.add("Hello");
//        ts.add(null); // NullPointerException
//        ts.add(new Integer(10));
        System.out.println(ts);
    }
}
