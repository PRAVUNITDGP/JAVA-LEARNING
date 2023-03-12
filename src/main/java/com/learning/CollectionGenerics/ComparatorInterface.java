package com.learning.CollectionGenerics;

import java.util.*;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(17);
        values.add(228);
        values.add(49);
        values.add(80);
        /*

           1 : Comparator class object
         */
        Comparator<Integer> com = new ComparatorImpl();
        /*
            2 : Anonymous class
         */
        Comparator<Integer> comAnonymous = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 % 10 > o2 % 10)
                    return 1;
                return -1 ;
            }
        };
        /*
            3 : Lambda Expression (Anonymous class using lambda expression)
         */
        Comparator<Integer> comLambda = (o1,o2) -> {
                if(o1 % 10 > o2 % 10)
                    return 1;
                return -1 ;
        };
        /*
            Normal sort function with objects
         */
        //Collections.sort(values,comLambda);
        /*
            Anonymous object
         */
        Collections.sort(values,(o1,o2) -> {
            if(o1 % 10 > o2 % 10)
                return 1;
            return -1 ;
        });
        values.forEach(e -> System.out.println(e));
    }
}
