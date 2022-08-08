package com.jayant.java.learnings.collection.sorting;

public class Employee implements Comparable {
    String ename;
    int id;

    public Employee(String ename, int id) {
        this.ename = ename;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        int idFromObject1 = this.id;
        Employee e = (Employee) o;
        int idFromObject2 = e.id;
        if(idFromObject1 < idFromObject2)
            return -1;
        else if (idFromObject1 > idFromObject2)
            return +1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", id=" + id +
                '}';
    }
}
