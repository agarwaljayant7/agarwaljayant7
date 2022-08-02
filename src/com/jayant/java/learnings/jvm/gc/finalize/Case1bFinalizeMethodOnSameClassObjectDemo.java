package com.jayant.java.learnings.jvm.gc.finalize;

public class Case1bFinalizeMethodOnSameClassObjectDemo {
    public static void main(String[] args) throws InterruptedException{

        Case1bFinalizeMethodOnSameClassObjectDemo object1 = new Case1bFinalizeMethodOnSameClassObjectDemo();
        object1 = null;
        System.out.println("Calling G.C. to free un-used objects");
        Runtime.getRuntime().gc();
        Thread.sleep(500);
        System.out.println("Called G.C.");
    }
    @Override
    public void finalize() throws Throwable {
        System.out.println("Calling finalize() method to perform clean up or resource de-allocation activities");
    }
}
