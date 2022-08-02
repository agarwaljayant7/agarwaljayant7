package com.jayant.java.learnings.jvm.gc;

public class MakeAnObjectEligibleForGCByCreatingTheObjectInsideAMethod_SpecialCase_AndByUsingAStaticInstanceVariable {
    static Employee e = null;

    public static void main(String[] args) {
        method1();
        // by this line, only one object is eligible for G.C
    }
    static void method1(){
        Employee e1 = new Employee();
        Employee e2 =  new Employee();

        e = e1;

    }
}
