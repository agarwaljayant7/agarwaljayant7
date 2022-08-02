package com.jayant.java.learnings.jvm.gc;

public class MakeAnObjectEligibleForGCByMakingTheObjectsInsideTheIslandOfIsolation {

    MakeAnObjectEligibleForGCByMakingTheObjectsInsideTheIslandOfIsolation variable1 = null;

    public static void main(String[] args) {

        MakeAnObjectEligibleForGCByMakingTheObjectsInsideTheIslandOfIsolation object1 = new
                MakeAnObjectEligibleForGCByMakingTheObjectsInsideTheIslandOfIsolation();

        MakeAnObjectEligibleForGCByMakingTheObjectsInsideTheIslandOfIsolation object2 = new
                MakeAnObjectEligibleForGCByMakingTheObjectsInsideTheIslandOfIsolation();

        MakeAnObjectEligibleForGCByMakingTheObjectsInsideTheIslandOfIsolation object3 = new
                MakeAnObjectEligibleForGCByMakingTheObjectsInsideTheIslandOfIsolation();


        object1.variable1 = object2;
        object2.variable1 = object3;
        object3.variable1 = object1;

        object1 = null;
        // by this line, no objects are eligible for Garbage Collection

        object2 = null;
        // by this line also, no objects are eligible for G.C.

        object3 = null;

        // by this line, none of the objects are having any references from the outside world, and hence all
        // three objects are eligible for Garbage Collection.

    }
}
