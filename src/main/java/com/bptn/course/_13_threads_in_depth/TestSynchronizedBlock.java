package com.bptn.course._13_threads_in_depth;

public class TestSynchronizedBlock {

    public static void main(String args[]) {

        Table table = new Table(); //only one instance

        MyThread2 t1 = new MyThread2(5,table);
        MyThread2 t2 = new MyThread2(100,table);

        t1.start();
        t2.start();
    }
}
