package com.jayant.java.learnings.jvm.gc;

public class MakeAnObjectEligibleForGCByReassigningTheRefVariableToANewObject {
    public static void main(String[] args) {

        MakeAnObjectEligibleForGCByReassigningTheRefVariableToANewObject o3 = new MakeAnObjectEligibleForGCByReassigningTheRefVariableToANewObject();
        MakeAnObjectEligibleForGCByReassigningTheRefVariableToANewObject o4 = new MakeAnObjectEligibleForGCByReassigningTheRefVariableToANewObject();

        o3 = new MakeAnObjectEligibleForGCByReassigningTheRefVariableToANewObject();
        // by this time, one object is eligible for G.C.
        o4 = o3;
        // by this time another one more object is eligible for G.C.
        System.out.println(o3.hashCode());
        System.out.println(o4.hashCode());
    }
}
