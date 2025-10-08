package com.bptn.course._13_threads_in_depth;

public class CountdownTimer implements Runnable {

    private int startValue;

    public CountdownTimer(int startValue) {

        // Assign the startValue parameter to the instance variable
        this.startValue = startValue;
    }

    @Override
    public void run() {
        // Complete the functionality of run() method. Complete Steps 2,3,4
        // Write a loop that counts down from the value of the startValue property to 1.
        for (int i = startValue; i >= 1; i--){
            // Inside the loop, print each number to the console.
            System.out.println(i);

            //Add a short delay (e.g., 500 milliseconds)
            // using the Thread.sleep() method after printing each number in the loop.
            // Make sure to surround the Thread.sleep() statement
            // with a try block and handle the InterruptedException
            // by printing the stack trace to the console in a catch block.
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    // Define the main function
    public static void main(String[] args) {


        // Create a new CountdownTimer object with a start value of your choice. For instance: 10
        CountdownTimer timer = new CountdownTimer(10);
        // Create a new Thread object, passing the countdownTimer object as the Runnable target
        Thread thread = new Thread(timer);
        thread.start();
        // Start the thread by calling the start() method
        System.out.println("Main thread continues to execute...");
    }
}

