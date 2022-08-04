package com.jayant.java.learnings.collection.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i = 0; i < 10; i++){
            v.add(i);
        }
        final Enumeration elements = v.elements();
        while(elements.hasMoreElements()){
            final Integer i = (Integer) elements.nextElement();
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println( v);
    }
}
