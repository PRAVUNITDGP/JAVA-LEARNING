package com.learning.Lambdas.pass_behavior;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = { 1, 2,4,5,5};
        int key = 0 ;
        process(someNumbers,key,wrapperLambda((a,b) -> System.out.println( a / b)));

    }

    private static void process(int[] someNumbers , int key , BiConsumer<Integer,Integer> consumer){
        for(int i : someNumbers){
            consumer.accept(i,key);
        }
    }
    public static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
        return (v,k) -> {
            /*
                We can ADD try Catch Here
             */
            try{
                System.out.println("Executing from Wrapper Lambda");
                consumer.accept(v,k);
            }catch (ArithmeticException e){
                System.out.println("Exception caught in wrapper lambda");
            }

        };
    }
}
