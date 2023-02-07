package com.learning.designPatterns.FactoryDesign;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC" , "2GB" , "100GB" , "2.4GHz");
        Computer computer = ComputerFactory.getComputer("Computer" , "2GB" , "100GB" , "2.4GHz");
        System.out.println("Factory PC config :: " +pc);
        System.out.println("Server PC is " +computer);
    }
}
