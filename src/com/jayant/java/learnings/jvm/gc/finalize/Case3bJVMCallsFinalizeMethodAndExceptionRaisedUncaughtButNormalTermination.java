package com.jayant.java.learnings.jvm.gc.finalize;

public class Case3bJVMCallsFinalizeMethodAndExceptionRaisedUncaughtButNormalTermination {
    public static void main(String[] args) throws InterruptedException {
        Case3bJVMCallsFinalizeMethodAndExceptionRaisedUncaughtButNormalTermination
                case3bJVMCallsFinalizeMethodAndExceptionRaisedUncaughtButNormalTermination =
                    new Case3bJVMCallsFinalizeMethodAndExceptionRaisedUncaughtButNormalTermination();
//
        case3bJVMCallsFinalizeMethodAndExceptionRaisedUncaughtButNormalTermination = null;

        System.out.println("Calling G.C. to clean up un-used objects");
        Runtime.getRuntime().gc();
        Thread.sleep(300);
        System.out.println("Called G.C.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Calling finalize() method");
        System.out.println(10 / 0);
    }
}
