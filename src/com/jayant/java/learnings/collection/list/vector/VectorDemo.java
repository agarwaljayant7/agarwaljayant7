package com.jayant.java.learnings.collection.list.vector;

import java.util.Vector;

//Objects of Vector are synchronized and hence at a time only one is allowed to operate on it
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity());

        for(int i = 0; i < 10; i++){
            v.add(i); // primitives will be converted into Objects and only objects will be added.
        }

        v.add("A");
        System.out.println(v.capacity());
        for(int i = 0; i < 10; i++){
            v.add(i); // primitives will be converted into Objects and only objects will be added.
        }
        System.out.println(v);
        System.out.println(v.capacity());
    }
}
