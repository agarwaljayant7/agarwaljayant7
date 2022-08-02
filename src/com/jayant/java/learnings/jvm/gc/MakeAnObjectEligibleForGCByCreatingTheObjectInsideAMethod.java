package com.jayant.java.learnings.jvm.gc;

public class MakeAnObjectEligibleForGCByCreatingTheObjectInsideAMethod {

    public static void main(String[] args) {
        m1();
        // at here, both the objects of method m1() are eligible for Garbage Collection by Garbage Collector.
    }

    public static void m1(){
        Employee o1 = new Employee();
        Employee o2 = new Employee();
    }
}
