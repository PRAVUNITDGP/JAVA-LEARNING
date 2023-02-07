package com.learning.designPatterns.DecorativePattern;

public class FarmHouse extends Pizza{

    public FarmHouse(){
        description = "FarmHouse";
    }
    public int getCost(){
        return 200;
    }
}
