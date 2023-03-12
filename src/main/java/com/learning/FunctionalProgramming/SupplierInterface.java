package com.learning.FunctionalProgramming;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());

        //Supplier Functional interface
        System.out.println(getDbConnectionSupplier.get());
    }
    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
    static Supplier<String> getDbConnectionSupplier = () ->
            "jdbc://localhost:5432/users";
}
