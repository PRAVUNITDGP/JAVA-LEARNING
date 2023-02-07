package com.learning.designPatterns.DecorativePattern;

public class PizzaHouse {
    public static void main(String[] args) {

        Pizza pizza = new Margherita();
        Pizza pizza2 = new FarmHouse();
        // Decorating Margherita with FreshTomato .. pizza object
        pizza = new FreshTomato(pizza);
        pizza = new Barbeque(pizza);
        pizza = new FreshTomato(pizza);
        System.out.println(pizza.getDescription() + "Cost : " + pizza2.getCost());



    }
}
