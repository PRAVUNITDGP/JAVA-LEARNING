package com.learning.designPatterns.DecorativePattern;

public class Barbeque extends ToppingsDecorator{
    Pizza pizza;
    public Barbeque(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDescription(){
        return pizza.getDescription() + ", Paneer";
    }
    @Override
    public int getCost(){
        return pizza.getCost() + 90;
    }
}
