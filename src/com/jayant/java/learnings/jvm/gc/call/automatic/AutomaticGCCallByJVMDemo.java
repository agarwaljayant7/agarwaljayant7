package com.jayant.java.learnings.jvm.gc.call.automatic;

public class AutomaticGCCallByJVMDemo {
    static int count = 0;
    public static void main(String[] args) {
        for(int i = 0; i < 2000000; i++){
            AutomaticGCCallByJVMDemo t = new AutomaticGCCallByJVMDemo();
            t = null;
        }
    }
    @Override
    public void finalize() throws Throwable{
        count++;
        System.out.println("finalize() method called: " + count);
    }
}
