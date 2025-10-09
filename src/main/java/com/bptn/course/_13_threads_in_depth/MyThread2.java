package com.bptn.course._13_threads_in_depth;
// goes with TestSynchronizedBlock
public class MyThread2 extends Thread {

    int i;
    Table t;

    MyThread2(int i, Table t) {
        this.i=i;
        this.t=t;
    }

    public void run() {
        t.printTable(this.i);
    }
}
