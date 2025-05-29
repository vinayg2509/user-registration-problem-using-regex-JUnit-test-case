package com.bridgelabz.userregistrationtesting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains parameterized unit tests for the UserRegistration class.
 * Each method tests a specific validation rule using a range of inputs.
 */
class UserRegistrationTest {

    // Test for validating different first name inputs
    @ParameterizedTest
    @ValueSource(strings = {"Vinay", "Vin", "vinay", ""})
    void validateFirstNameTest(String firstName) {
        boolean result = UserRegistration.validateFirstName(firstName);
        assertTrue(result, "Test failed for input: \"" + firstName + "\"");
        System.out.println("Test passed for input: \"" + firstName + "\"");
    }

    // Test for validating different last name inputs
    @ParameterizedTest
    @ValueSource(strings = {"Vinay", "Vin", "vinay", ""})
    void validateLastNameTest(String lastName) {
        boolean result = UserRegistration.validateLastName(lastName);
        assertTrue(result, "Test failed for input: \"" + lastName + "\"");
        System.out.println("Test passed for input: \"" + lastName + "\"");
    }

    // Test for validating various email formats (valid and invalid)
    @ParameterizedTest
    @ValueSource(strings = {"vinayg@gmail.com", "vin.co.in", "vinay123@gmail.com", "vinay&@gmail.com"})
    void validateEmailTest(String email) {
        boolean result = UserRegistration.validateEmail(email);
        assertTrue(result, "Test failed for input: \"" + email + "\"");
        System.out.println("Test passed for input: \"" + email + "\"");
    }

    // Test for validating different mobile number formats
    @ParameterizedTest
    @ValueSource(strings = {"91 812345678", "911234567890", "91 8123804221"})
    void validateMobileNUmber(String mobileNumber) {
        boolean result = UserRegistration.validateMobileNumber(mobileNumber);
        assertTrue(result, "Test failed for input: \"" + mobileNumber + "\"");
        System.out.println("Test passed for input: \"" + mobileNumber + "\"");
    }

    // Test for password Rule One: minimum 8 characters
    @ParameterizedTest
    @ValueSource(strings = {"12345678", "qwertyu", "", "1234567890"})
    void validateRuleOneTest(String password) {
        boolean result = UserRegistration.validateRuleOne(password);
        assertTrue(result, "Test failed for input: \"" + password + "\"");
        System.out.println("Test passed for input: \"" + password + "\"");
    }

    // Test for password Rule Two: at least 1 uppercase character
    @ParameterizedTest
    @ValueSource(strings = {"A1243SW ", "Acr453146", "", "AAw22321536"})
    void validateRuleTwoTest(String password) {
        assertTrue(UserRegistration.validateRuleTwo(password), "Test failed for input: \"" + password + "\"");
        System.out.println("Test passed for input: \"" + password + "\"");
    }

    // Test for password Rule Three: at least 1 numeric digit
    @ParameterizedTest
    @ValueSource(strings = {"A1243SuuW", "Acr", "", "AAw22321536", "qwertyuio"})
    void validateRuleThreeTest(String password) {
        assertTrue(UserRegistration.validateRuleThree(password), "Test failed for input: \"" + password + "\"");
        System.out.println("Test passed for input: \"" + password + "\"");
    }

    // Test for password Rule Four: exactly 1 special character
    @ParameterizedTest
    @ValueSource(strings = {" ", "12A34@12", "AW21@#$ ", " AQW1qwerty"})
    void validateRuleFourTest(String password) {
        assertTrue(UserRegistration.validateRuleFour(password), "Test failed for input: \"" + password + "\"");
        System.out.println("Test passed for input: \"" + password + "\"");
    }

    // Test for reusable email validation method with duplicate check
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
            "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"
    })
    void validEmailTest(String email) {
        // Asserts the email is valid and not a duplicate
        assertTrue(UserRegistration.validEmail(email), email + " Invalid or Duplicate");
        System.out.println(email + " Valid & Added");
    }
}
