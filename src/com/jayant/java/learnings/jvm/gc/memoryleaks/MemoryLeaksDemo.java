package com.jayant.java.learnings.jvm.gc.memoryleaks;

public class MemoryLeaksDemo {
    static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        int mb = 1024 * 1024;
        Runtime r = Runtime.getRuntime();
        System.out.println("Max memory: " + r.maxMemory() / mb);
        System.out.println("Total memory: " + r.totalMemory() / mb);
        System.out.println("Free memory: " + r.freeMemory() / mb);

        for(long i = 0; i < 1000000000; i++){
            MemoryLeaksDemo m = new MemoryLeaksDemo();
            // to avoid the memory leak, nullify the unused obj. ref. variable like m = null;
        }
        System.out.println("Post obj. creation," + "\nmax memory: " + r.maxMemory() / mb);
        System.out.println("\ntotal memory: " + r.totalMemory() / mb);
        System.out.println("\nFree memory: " + r.freeMemory() / mb);
        Thread.sleep(10000);
        System.out.println("finalize()s method got called: " + count + " times");
        System.out.println("Post calling finalize() method, \nFree memory:" + r.freeMemory() / mb);
    }

    @Override
    protected void finalize() throws Throwable {
//        System.out.println("Finalized method called");
        count++;
    }
}
