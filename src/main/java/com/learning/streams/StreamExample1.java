package com.learning.streams;

import com.learning.Lambdas.pass_behavior.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("charles","dickens",90),
                new Person("pravakar","rao",90),
                new Person("Thomas","carrol",90),
                new Person("Charlotte","bronte",90),
                new Person("Matthew","arnold",90)

        );
        people.stream()
                .filter(p -> p.getLastname().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));
        long count = people.stream()
                .filter(p -> p.getLastname().startsWith("d"))
                .count();

        System.out.println(count);

        /*
            Parallel Stream
         */

        long countParallel = people.parallelStream()
                .filter(p -> p.getLastname().startsWith("D"))
                .count();
        System.out.println("Parallel Count is -> " +countParallel);

    }


}
