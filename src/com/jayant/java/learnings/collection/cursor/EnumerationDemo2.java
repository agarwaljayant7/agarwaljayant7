package com.jayant.java.learnings.collection.cursor;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationDemo2 {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        int size = v1.capacity();
        for(int i = 0; i <= size; i++){
            v1.add(i);
        }
        Enumeration e = v1.elements();
        while(e.hasMoreElements()){
            Integer i = (Integer) e.nextElement();
            if(i % 2  == 0){
                System.out.println(i);
            }
        }
        System.out.println(v1);
    }
}
