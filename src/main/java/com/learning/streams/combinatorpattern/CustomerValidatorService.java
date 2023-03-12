package com.learning.streams.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    public boolean validateEmail(String email){
        return email.contains("@");
    }
    public boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.startsWith("+0");
    }
    public boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears() > 16 ;
    }
    public boolean isValid(Customer customer){
        return validateEmail(customer.getEmail()) &&
                validatePhoneNumber(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());
    }
}
