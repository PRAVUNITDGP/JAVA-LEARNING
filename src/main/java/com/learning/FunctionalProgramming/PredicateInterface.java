package com.learning.FunctionalProgramming;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        //Boolean
        /*
            without predicate
         */
        System.out.println(isPhoneNumberValid("0900000"));
        System.out.println(isPhoneNumberValid("0700000"));
        /*
            With Predicate
         */
        System.out.println(isPhoneNumberValidPredicate.test("0900000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000"));


    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11 ;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11 ;

}
