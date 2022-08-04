package com.jayant.java.learnings.collection.cursor.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for(int i = 0; i < 10; i++){
            al.add(i);
        }
        Iterator iterator = al.iterator();
        while(iterator.hasNext()){
            Integer i = (Integer) iterator.next();
            if(i % 2 != 0){
                iterator.remove();
            }
        }
        System.out.println(al);
    }
}
