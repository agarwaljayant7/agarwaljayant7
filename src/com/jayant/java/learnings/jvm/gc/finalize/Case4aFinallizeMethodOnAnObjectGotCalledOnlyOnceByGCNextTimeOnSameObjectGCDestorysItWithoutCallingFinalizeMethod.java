package com.jayant.java.learnings.jvm.gc.finalize;

public class
Case4aFinallizeMethodOnAnObjectGotCalledOnlyOnceByGCNextTimeOnSameObjectGCDestorysItWithoutCallingFinalizeMethod {
    static
    Case4aFinallizeMethodOnAnObjectGotCalledOnlyOnceByGCNextTimeOnSameObjectGCDestorysItWithoutCallingFinalizeMethod
    staticVariable = null;

    public static void main(String[] args) throws InterruptedException {
        Case4aFinallizeMethodOnAnObjectGotCalledOnlyOnceByGCNextTimeOnSameObjectGCDestorysItWithoutCallingFinalizeMethod
                object = new
                Case4aFinallizeMethodOnAnObjectGotCalledOnlyOnceByGCNextTimeOnSameObjectGCDestorysItWithoutCallingFinalizeMethod();
        System.out.println("Object hashCode: " + object.hashCode());
        object = null;
        Runtime.getRuntime().gc();
        Thread.sleep(10000);
        System.out.println("Object's (assigned to static variable) hashCode : " + staticVariable.hashCode());
        staticVariable = null;
        System.out.println("Calling G.C. 2nd Time but this time it won't call the finalize() method and most probably it" +
                " will directly destroy the object");
        Runtime.getRuntime().gc();
        System.out.println("Called G.C. 2nd Time");
    }

    @Override
    protected void finalize() throws Throwable {

        System.out.println("Finalize() method got called");
        staticVariable = this;
    }
}
