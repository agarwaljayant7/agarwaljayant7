package com.jayant.java.learnings.collection.sorting;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparableAndComparatorForRealWorldClasses {
    public static void main(String[] args) {
        SortedSet<Employee> s = new TreeSet();
        s.add(new Employee("RRR", 100));
        s.add(new Employee("AAA", 001));
        s.add(new Employee("ZZZ", 1000));
        s.add(new Employee("AZB", 300));
        s.add(new Employee("ZAA", 200));

        System.out.println(s);
    }
}
