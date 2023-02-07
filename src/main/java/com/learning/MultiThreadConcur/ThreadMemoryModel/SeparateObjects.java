package com.learning.MultiThreadConcur.ThreadMemoryModel;

public class SeparateObjects {

    public static void main(String[] args) {

        Runnable runnableOne = new MyRunnable();
        Runnable runnableTwo = new MyRunnable();

        Thread threadOne = new Thread(runnableOne,"Thread 1 ");
        Thread threadTwo = new Thread(runnableTwo , "Thread 2");
        threadOne.start();
        threadTwo.start();

    }

}
