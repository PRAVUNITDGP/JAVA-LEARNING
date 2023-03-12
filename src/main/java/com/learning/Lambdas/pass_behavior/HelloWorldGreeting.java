package com.learning.Lambdas.pass_behavior;

public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform(){
        System.out.println("Hellow World Greeting");
    }
}
