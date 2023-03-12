package com.learning.Lambdas.pass_behavior;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 70),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Matthew", "Arnold", 45)

        );

        //Step 1 : sort list by last name

        // Step 2  : Create a method that prints all elements in the list


        /**
         * Using Java lambda
         *
         *
         */
        //Step 1 :
        Collections.sort(people, Comparator.comparing(Person::getLastname));

        //Step2 :
        System.out.println("printing all persons");
        printConditionally(people, p -> true);
        //Step3 :
        System.out.println("printing all persons with last name beginning with C");
        printConditionally(people, p -> p.getLastname().startsWith("C"));

    }
    private static void printConditionally(List<Person> people , Condition condition){
        for(Person person : people){
            if(condition.test(person)){
                System.out.println(person);
            }
        }
    }
}
