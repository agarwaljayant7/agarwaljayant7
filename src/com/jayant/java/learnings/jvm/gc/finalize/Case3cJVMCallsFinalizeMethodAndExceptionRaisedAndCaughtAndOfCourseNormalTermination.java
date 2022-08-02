package com.jayant.java.learnings.jvm.gc.finalize;

public class Case3cJVMCallsFinalizeMethodAndExceptionRaisedAndCaughtAndOfCourseNormalTermination {

    public static void main(String[] args) throws InterruptedException{
        Case3cJVMCallsFinalizeMethodAndExceptionRaisedAndCaughtAndOfCourseNormalTermination
                case3cJVMCallsFinalizeMethodAndExceptionRaisedAndCaughtAndOfCourseNormalTermination
                = new Case3cJVMCallsFinalizeMethodAndExceptionRaisedAndCaughtAndOfCourseNormalTermination();

        case3cJVMCallsFinalizeMethodAndExceptionRaisedAndCaughtAndOfCourseNormalTermination = null;

        System.out.println("calling G.C to clear un-used objects from heap memory area");
        Runtime.getRuntime().gc();
        Thread.sleep(10000);
        System.out.println("Called G.C.");
        System.out.println("Normal termination by \"main\" thread");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Calling finalize() method");
        try{
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("Catch block got called");
        }
        finally {
            System.out.println("Inside finally block");
        }
        System.out.println("Normal termination by G.C. thread");
    }
}
