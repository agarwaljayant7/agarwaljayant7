package com.jayant.java.learnings.jvm.gc.finalize;

import javax.sound.midi.Soundbank;

public class Case3aProgrammerCallsFinalizeMethodAndExceptionRaisedUncaughtAbnormalTermination {
    public static void main(String[] args) throws Throwable {

        Case3aProgrammerCallsFinalizeMethodAndExceptionRaisedUncaughtAbnormalTermination
                case3aProgrammerCallsFinalizeMethodAndExceptionRaisedUncaughtAbnormalTermination =
                new Case3aProgrammerCallsFinalizeMethodAndExceptionRaisedUncaughtAbnormalTermination();

        case3aProgrammerCallsFinalizeMethodAndExceptionRaisedUncaughtAbnormalTermination.finalize();

        case3aProgrammerCallsFinalizeMethodAndExceptionRaisedUncaughtAbnormalTermination = null;

        System.out.println("Calling Garbage Collector to delete un-used objects");
        Runtime.getRuntime().gc();
        Thread.sleep(100);
        System.out.println("Called Garbage Collector ");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Inside finalize() method");
        System.out.println(10 / 0);
    }
}
