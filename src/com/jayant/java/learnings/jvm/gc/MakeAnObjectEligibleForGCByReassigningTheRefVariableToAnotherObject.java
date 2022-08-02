package com.jayant.java.learnings.jvm.gc;

public class MakeAnObjectEligibleForGCByReassigningTheRefVariableToAnotherObject {
    public static void main(String[] args) {
        MakeAnObjectEligibleForGCByReassigningTheRefVariableToAnotherObject ob1 = new MakeAnObjectEligibleForGCByReassigningTheRefVariableToAnotherObject();
        MakeAnObjectEligibleForGCByReassigningTheRefVariableToAnotherObject ob2 = new MakeAnObjectEligibleForGCByReassigningTheRefVariableToAnotherObject();

        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        ob1 = ob2; // here, one object is eligible for gc.
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        ob2 = null; // // here, still only one object is eligible for gc.
        ob1 = null; // here, now two objects are eligible for gc.


    }

}
