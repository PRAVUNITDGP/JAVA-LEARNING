package com.learning.Lambdas.pass_behavior;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class ForEachIteration {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("charles","dickens",90),
                new Person("pravakar","rao",90),
                new Person("Thomas","carrol",90),
                new Person("Charlotte","bronte",90),
                new Person("Matthew","arnold",90)

        );
        people.forEach(p-> System.out.println(p));
        people.forEach(System.out::println);
    }

}
