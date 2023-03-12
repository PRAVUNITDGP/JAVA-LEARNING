package com.learning.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeDeclarative {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.MALE)

        );

        /**
         * Imperative Approach
         */
        System.out.println("Imperative Approach below ::: ");
        List<Person> female = new ArrayList<>();
        for(Person p : people){
            if(Gender.FEMALE.equals(p.gender)){
                female.add(p);
            }
        }
        for(Person p : female){
            System.out.println(female);
        }

        /**
         * Declarative Approach
         */
        System.out.println("Declarative Approach below ::: ");
        List<Person> femaleDecl = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        femaleDecl.forEach(System.out::println);

    }

    static class Person {
        private final String name ;
        private final Gender gender ;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE,FEMALE
    }
}
