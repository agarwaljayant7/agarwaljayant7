package com.jayant.java.learnings.collection.sorting;

import java.util.Comparator;

public class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee employeeObject1 = (Employee) o1;
        Employee employeeObject2 = (Employee) o2;
        String s1 = employeeObject1.ename;
        String s2 = employeeObject2.ename;
//        if(s1.length() < s2.length())
//            return 1;
//        else if(s1.length() > s2.length())
//            return -1;
//        else if(s1.length() == s2.length())
//            return 0;
        return -s1.compareTo(s2);
    }
}
