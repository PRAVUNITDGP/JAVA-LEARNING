package com.learning.streams.combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@a.com",
                "+088998888888",
                LocalDate.of(2000,1,12)
        );
        System.out.println(new CustomerValidatorService().isValid(customer));
    }
}
