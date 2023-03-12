package com.learning.Lambdas.pass_behavior;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 10  ;
        /*
            above a,b are closures to below lambda expression
            the frozen value is taken just before it is called.
            It is final automatically.
         */
        doProcess(a,i -> System.out.println(i + b));
    }
    public static void doProcess(int i , Process p ){
        p.process(i);
    }
}

interface Process{
    void process(int i);
}