package com.bridgelabz.userregistrationtesting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest
{
    @ParameterizedTest
    @ValueSource(strings={"Vinay","Vin","vinay",""})
    void validateFirstNameTest(String firstName)
    {
        boolean result = UserRegistration.validateFirstName(firstName);
        assertTrue(result, "Test failed for input: \"" + firstName + "\"");
        System.out.println("Test passed for input: \"" + firstName + "\"");
    }

    @ParameterizedTest
    @ValueSource(strings={"Vinay","Vin","vinay",""})
    void validateLastNameTest(String lastName)
    {
        boolean result = UserRegistration.validateLastName(lastName);
        assertTrue(result, "Test failed for input: \"" + lastName + "\"");
        System.out.println("Test passed for input: \"" + lastName + "\"");
    }

    @ParameterizedTest
    @ValueSource(strings={"vinayg@gmail.com","vin.co.in","vinay123@gmail.com","vinay&@gmail.com"})
    void validateEmailTest(String email)
    {
        boolean result = UserRegistration.validateEmail(email);
        assertTrue(result, "Test failed for input: \"" + email + "\"");
        System.out.println("Test passed for input: \"" + email + "\"");
    }

    @ParameterizedTest
    @ValueSource(strings = {"91 812345678","911234567890","91 8123804221"})
    void validateMobileNUmber(String mobileNumber)
    {
        boolean result=UserRegistration.validateMobileNumber(mobileNumber);
        assertTrue(result,"Test failed for input:\""+mobileNumber+"\"");
        System.out.println("Test passed for input: \"" + mobileNumber + "\"");
    }

}