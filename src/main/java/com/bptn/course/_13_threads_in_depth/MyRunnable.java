package com.bptn.course._13_threads_in_depth;

public class MyRunnable implements Runnable {

    // Implement the run() method
    @Override
    public void run() {
        // Define the behavior of the thread here
        // This code will be executed when the thread starts
        System.out.println("Hello from the run() method!");
    }

    public static void main(String[] args) {
        // Create an instance of the class that implements Runnable
        MyRunnable myRunnable = new MyRunnable();

        // Create a Thread object and pass the instance of the Runnable implementation
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();
    }
}

