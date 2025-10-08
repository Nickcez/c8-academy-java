package com.bptn.course._13_threads_in_depth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {

    // Declare an instance variable of type List<Integer>
    List<Integer> list;
    // Create a parameterized constructor.
    public MyThread(String name, List<Integer> list) {
        super(name);
        this.list = list;
    }
    // Override the run() method here.

    //Override the run() method in the MyThread class.
    @Override
    public void run() {
        // In the run() method, invoke the insertNextId() static method of the ListUtils class.
        // Pass the list instance variable when invoking the insertNextId() method.
        // Remember that static methods need the class name in front of them to be invoked.
        ListUtils.insertNextId(list);
    }
}
