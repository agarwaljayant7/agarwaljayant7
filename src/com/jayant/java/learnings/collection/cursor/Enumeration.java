package com.jayant.java.learnings.collection.cursor;

import java.util.Vector;

// To get the objects one - by - one from the legacy classes of Collection, we can use Enumeration
public class Enumeration {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add("Shiva");
        v.add(10);
        v.add(null);
        v.addElement(true);

        final java.util.Enumeration elements = v.elements();
        final Enumeration e = (Enumeration) v.elements();
    }
}
