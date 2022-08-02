package com.jayant.java.learnings.jvm.gc;

public class
    MakeAnObjectEligibleForGCByCreatingTheObjectInsideAMethod_SpecialCase_ByReturningTheObjectToTheCallerOfTheMethod {

    public static void main(String[] args) {
        Employee e1 = method1();
        // By here, only one object is eligible for GC;
    }
    static Employee method1(){
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        return e2;

    }
}
