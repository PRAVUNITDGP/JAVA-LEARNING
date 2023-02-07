package com.learning.designPatterns.FactoryDesign;

public class ComputerFactory{
    public static Computer getComputer(String computerType , String ram ,String hdd,String cpu){
        if("PC".equalsIgnoreCase(computerType))
            return new PC(ram,hdd,cpu);
        else if("Computer".equalsIgnoreCase(computerType))
            return new Server(ram,hdd,cpu);

        return null;
    }
}
