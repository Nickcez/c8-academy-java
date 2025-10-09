package com.bptn.course._13_threads_in_depth;

public class Table {

    void printTable(int n) {

        // Begin our synchronized block:
        synchronized(this) {
            for(int i=1; i<=5; i++) {
                System.out.println(n*i);
                try {
                    Thread.sleep(400);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
        // End of the synchronized block.
    }
}
