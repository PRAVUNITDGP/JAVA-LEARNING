package com.learning.interfaces;

public class Car implements Break,Engine{

    @Override
    public  void brake(){
        System.out.println("Applying Break");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelearating");
    }
}
