package com.learning.FunctionalProgramming;

import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {
        /**
         *
         * Bifunction -> two arguments and one Output
         */
        System.out.println(incrementBY1MultBiFunction.apply(4,100));

    }
    static BiFunction<Integer , Integer,Integer> incrementBY1MultBiFunction =
            (numberToIncrementByOne,numberToMultiplyBy)
                -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
    static int incrementByOneAndMultiply(int number , int numToMultiplyBy){
        return (number +1) * numToMultiplyBy;
    }
}
