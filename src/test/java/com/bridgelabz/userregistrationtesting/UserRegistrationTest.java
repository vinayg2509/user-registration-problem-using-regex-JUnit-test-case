package com.bridgelabz.userregistrationtesting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest
{
    @ParameterizedTest
    @ValueSource(strings={"Vinay","Vin","vinay",""})
    void validateFirstName(String firstName)
    {
        boolean result = UserRegistration.validateFirstName(firstName);
        assertTrue(result, "Test failed for input: \"" + firstName + "\"");
        System.out.println("Test passed for input: \"" + firstName + "\"");
    }

}