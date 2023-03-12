package com.learning.FunctionalProgramming;

import com.learning.Lambdas.pass_behavior.FunctionalInterface;

import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {
        /*
            increment By 1
         */
        int increment1 = incrementByOneFunc.apply(1);
        System.out.println(increment1);
        int multiply = multiplyBy10.apply(increment1);
        System.out.println(multiply);

        /*
            Chaining of Functional Interfaces
         */
        Function<Integer,Integer> addBy1AndThenMulitplyBy10 =
                incrementByOneFunc.andThen(multiplyBy10);
        System.out.println(addBy1AndThenMulitplyBy10.apply(1));
    }
    static Function<Integer,Integer> incrementByOneFunc = number -> number + 1 ;
    static Function<Integer,Integer> multiplyBy10 = number -> number * 10 ;


}
