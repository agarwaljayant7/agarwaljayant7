package com.jayant.java.learnings.jvm.gc.call;

import com.jayant.java.learnings.jvm.gc.Employee;

import java.util.Date;

public class DifferentWaysToRequestJVMToCallGC {

    public static void main(String[] args) {
        int mb = 1024 * 1024;
        Runtime r = Runtime.getRuntime();
        System.out.println("Initial Total memory of heap: " + r.totalMemory() / mb);
        System.out.println("Initial Free memory of heap: " + r.freeMemory() / mb);
        for(int i = 0; i < 1000000; i++){
            Date d = new Date();
            d = null;
        }
        System.out.println("After objects creation, Free memory of heap:  "  + r.freeMemory() / mb);
        r.gc();
        System.out.println("After calling G.C. : Free memory of heap: "  + r.freeMemory() / mb);

    }
}
