package com.learning.FunctionalProgramming;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        //Normal Java function
        greetCustomer(new Customer("maria","98979809890"));
        //Consumer Functional Interface
        greetCustomerConsumer.accept(new Customer("maria","98979809890"));

    }
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("hello" + customer.customerName + "Registered" + customer.customerPhoneNumber);
    static void greetCustomer(Customer customer){
        System.out.println("hello" + customer.customerName + "Registered" + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName ;
        private final String customerPhoneNumber ;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }
}
