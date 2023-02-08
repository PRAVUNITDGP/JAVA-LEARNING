package com.learning.MultiThreadConcur.MemoryModel;

public class SharedObjects {

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable,"Thread 1");
        Thread thread2 = new Thread(runnable,"Thread 2");
        thread1.start();
        thread2.start();
    }

    /*
        Output :
        Thread 1 : 1140887
        Thread 2 : 1889668
     */

}
