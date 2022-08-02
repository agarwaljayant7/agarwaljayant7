package com.jayant.java.learnings.jvm.gc.finalize;

public class
    Case4bFinallizeMethodOnAnObjectGotCalledOnlyOnceByGCNextTimeOnSameObjectGCDestorysItWithoutCallingFinalizeMethod {
    static
    Case4bFinallizeMethodOnAnObjectGotCalledOnlyOnceByGCNextTimeOnSameObjectGCDestorysItWithoutCallingFinalizeMethod
    s1 = null;

    public static void main(String[] args) throws InterruptedException{
        Case4bFinallizeMethodOnAnObjectGotCalledOnlyOnceByGCNextTimeOnSameObjectGCDestorysItWithoutCallingFinalizeMethod
                object1 = new
                Case4bFinallizeMethodOnAnObjectGotCalledOnlyOnceByGCNextTimeOnSameObjectGCDestorysItWithoutCallingFinalizeMethod();

        object1 = null;
        System.out.println("Calling G.C. to free un-used objects from heap memory area");
        Runtime.getRuntime().gc();

        Thread.sleep(1000);
        System.out.println("Called G.C.");

        s1 = null;

        System.out.println("Calling G.C. 2nd time and this time finalize() method won't be called");
        System.gc();
        Thread.sleep(1000);
        System.out.println("Called GC ");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Calling finalize() method");
        s1 = this;
    }
}
