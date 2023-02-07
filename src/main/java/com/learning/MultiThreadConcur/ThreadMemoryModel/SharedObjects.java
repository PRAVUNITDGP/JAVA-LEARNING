package com.learning.MultiThreadConcur.ThreadMemoryModel;

public class SharedObjects {

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread threadOne = new Thread(runnable , "Thread1");
        Thread threadTwo = new Thread(runnable , "Thread2");

        threadOne.start();
        threadTwo.start();
    }

}
