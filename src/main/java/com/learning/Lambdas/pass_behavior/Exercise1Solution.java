package com.learning.Lambdas.pass_behavior;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Exercise1Solution {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",70),
                new Person("Lewis","Carroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Matthew","Arnold",45)

        );

        //Step 1 : sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        });

        // Step 2  : Create a method that prints all elements in the list
        printAll(people);

        // Step 3 : Create a method that prints all people that have last name beginning with C
        printLastNameBeginningWithC(people);

        /**
         * Using Java lambda
         *
         *
         */
        //Step 1 :
        Collections.sort(people , (p1,p2) -> p1.getLastname().compareTo(p2.getLastname()));

        //Step2 :
        System.out.println("printing all persons");
        printConditionally(people,p -> true);
        //Step3 :
        System.out.println("printing all persons with last name beginning with C");
        printConditionally(people , p -> p.getLastname().startsWith("C"));

    }

    /**
     *
     *Predicate Function
     */
    private static void printConditionallyPredicate(List<Person> people , Predicate<Person> predicate){
        for(Person person : people){
            if(predicate.test(person)){
                System.out.println(person);
            }
        }
    }
    private static void printConditionally(List<Person> people , Condition condition){
        for(Person person : people){
            if(condition.test(person)){
                System.out.println(person);
            }
        }
    }
    private static void printAll(List<Person> people){
        for(Person p : people){
            System.out.println(p);
        }
    }



    private static void printLastNameBeginningWithC(List<Person> people){
        for(Person p : people){
            if(p.getLastname().startsWith("C")){
                System.out.println(p);
            }
        }
    }

    /**
     * Using Java lambda
     *
     *
     */
    //step1 : Sort list by last name

}

interface Condition {
    boolean test(Person p);
}