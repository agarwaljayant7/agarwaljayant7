package com.jayant.java.learnings.jvm.gc;

public class MakeAnObjectEligibleForGCByNullifyingTheRefVariable {

    public static void main(String[] args) {
        MakeAnObjectEligibleForGCByNullifyingTheRefVariable object1 = new MakeAnObjectEligibleForGCByNullifyingTheRefVariable();
        MakeAnObjectEligibleForGCByNullifyingTheRefVariable object2 = new MakeAnObjectEligibleForGCByNullifyingTheRefVariable();
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        object1 = null; // here 1 object is eligible for gc as it's having no reference varibale assigned with it.
        object2 = null; // here 2 objects are eligible for gc as they both are not having any reference variables assigned
                        // with each of them.
                        // here, JVM may not call the garbage collector immediately
//        System.out.println(object1.hashCode()); // null pointer exception as these local variables are not having any
                                                // associated objecsts assigned to them.
//        System.out.println(object2.hashCode());// same as above
    }
}
