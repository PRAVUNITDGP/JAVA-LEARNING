package com.learning.MultiThreadConcur.MemoryModel;

public class SeparateObjects {
    public static void main(String[] args) {

        Runnable runnable1 = new MyRunnable();
        Runnable runnable2 = new MyRunnable();

        Thread thread1 = new Thread(runnable1 , "Thread 1");
        Thread thread2 = new Thread(runnable2,"Thread 2");

        thread1.start();
        thread2.start();
    }

    /*
        Output :
        Thread 2 : 1000000
        Thread 1 : 1000000
     */
}
