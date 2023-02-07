package com.learning.designPatterns;

public class EagerIniSingleTon {

    private static final EagerIniSingleTon instance = new EagerIniSingleTon();
    private EagerIniSingleTon(){};
    private static EagerIniSingleTon getInstance(){
        return instance ;
    }

}
