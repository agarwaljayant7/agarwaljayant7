package com.jayant.java.learnings.jvm.gc.finalize;

public class Case1aFinalizeMethodOnAnotherObjectDemo {

    public static void main(String[] args) throws InterruptedException {
        String s = new String("Durga");
        s = null;
        System.out.println("Calling GC to free un-used space from memory");
        Runtime.getRuntime().gc();
        Thread.sleep(1000);
        System.out.println("Called GC");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Calling finalize() method");    // This won't be called as there is no object of this
                                                            // class 'Case1FinalizeMethodOnAnotherObjectDemo'
                                                            // which is eligible for Garbage Collection
        super.finalize();
    }
}

