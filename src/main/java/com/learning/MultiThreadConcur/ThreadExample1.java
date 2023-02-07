package com.learning.MultiThreadConcur;

public class ThreadExample1 {

    public static class MyThread extends Thread{

        public void run(){
            System.out.println("MyThread is Running");
            System.out.println("MyThread is Finished");
        }

    }

    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
    }

}
