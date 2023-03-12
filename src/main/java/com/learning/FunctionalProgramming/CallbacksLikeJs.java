package com.learning.FunctionalProgramming;

import java.util.function.Consumer;

public class CallbacksLikeJs {
    public static void main(String[] args) {
        hello("john","Montana" , value -> {
            System.out.println("no lastName provided for " + value);
        });

        helloRunnable("Pravakar","Rao" , () ->  System.out.println("to Runnable"));
    }
    static void hello(String firstName ,String lastName , Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }
        else{
            callback.accept(firstName);
        }
    }
    static void helloRunnable(String firstName , String lastName , Runnable callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }
        else{
            callback.run();

        }
    }
}
