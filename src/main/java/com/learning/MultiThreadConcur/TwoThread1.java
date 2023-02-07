package com.learning.MultiThreadConcur;

import java.sql.SQLOutput;

interface  CheckLambda{
    void allowLambda();
}
public class TwoThread1 {

    public static void main(String[] args) {

        CheckLambda uSleep = () -> {
            try{
                Thread.sleep(2000);
              }catch (InterruptedException e){
                e.printStackTrace();
              }
        };
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " <- is Running");
            uSleep.allowLambda();
            System.out.println(threadName + "<- is Finished");
        };
        Runnable runnableTwo = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " <- is Running");
            uSleep.allowLambda();
            System.out.println(threadName + " <- is Finished");
        };

        Thread firstThread = new Thread(runnable , "Thread 1");
        firstThread.start();
        Thread secondThread = new Thread(runnable, "Thread 2");
        secondThread.start();

    }

}
