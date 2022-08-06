package com.jayant.java.learnings.collection.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        //Uncommenting the below lines, as we are not using the Customized Sorting order
        // - and going for the default natural sorting order, will cause RuntimeException called ClassCastException
        // as StringBuffer doesn't implement Comparable interface
        // whereas String or other WrapperClasses does

        /*
        ts.add(new StringBuffer("a"));
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
         */

        ts.add(10);
        ts.add(0);
        ts.add(-1);
        ts.add(20);
        System.out.println(ts);
    }
}
