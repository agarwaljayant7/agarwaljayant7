package com.jayant.java.learnings.jvm.gc.finalize;

public class Case2FinalizeMethodCallByNotGCDemo {
    public static void main(String[] args) throws Throwable{
        Case2FinalizeMethodCallByNotGCDemo case2FinalizeMethodCallByNotGCDemo =
                new Case2FinalizeMethodCallByNotGCDemo();
        case2FinalizeMethodCallByNotGCDemo.finalize();
        case2FinalizeMethodCallByNotGCDemo.finalize();
        case2FinalizeMethodCallByNotGCDemo = null;
        System.out.println("Calling garbage collector to delete un-used objects from memory");
        Runtime.getRuntime().gc();
        Thread.sleep(200);
        System.out.println("Called G.C.");
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Calling finalize() method");
    }
}
