package com.jayant.java.learnings.jvm.gc;

public class MakeAnObjectEligibleForGCByCreatingTheObjectInsideAMethod_SpecialCase_ByNotReturningTheObjectToTheCallerOfTheMethod {
    public static void main(String[] args) {
        method1();
        // By this line, 2 objects are eligible for G.C.
    }
    static void method1(){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
    }
}
