package com.jayant.java.learnings.collection.cursor.iterator;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("jsdf129-39-#)($&!)(&$");
        l.add("123154");
        l.add(null);
        l.add("f");

        ListIterator ltr = l.listIterator();

        while(ltr.hasNext()){


            String s = (String) ltr.next();
            try {
                if (s.equals("jsdf129-39-#)($&!)(&$")) {
                    ltr.remove();
                } else if (s.equals("f")) {
                    ltr.add("g");
                } else if (s.equals("123154")) {
                    ltr.set(9);
                }
            }
            catch(NullPointerException e){
                e.printStackTrace();
            }
        }

        System.out.println(l);


    }
}
