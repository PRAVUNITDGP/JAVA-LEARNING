package com.learning.Lambdas.pass_behavior;

public class RunnableExample {
    public static void main(String[] args) {

        /**
         * Runnable using anonymous inner class Example
         */
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable anonymous inner class");
            }
        });
        /**
         * Runnable using Lambda Expression
         */
        Thread myLambdaThread = new Thread(()-> System.out.println("Runnable from Lambda"));
        myThread.run();
        myLambdaThread.run();
    }
}
