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

    @ParameterizedTest
    @ValueSource(strings = {"12345678","qwertyu","","1234567890"})
    void validateRuleOneTest(String  password)
    {
        boolean result=UserRegistration.validateRuleOne(password);
        assertTrue(result,"Test failed for input:\""+password+"\"");
        System.out.println("Test passed for input:\""+password+"\"");
    }

    @ParameterizedTest
    @ValueSource(strings = {"A1243SW ","Acr453146","","AAw22321536"})
    void validateRuleTwoTest(String password)
    {
        assertTrue(UserRegistration.validateRuleTwo(password),"Test failed for input:\""+password+"\"");
        System.out.println("Test passed for input :\""+password+"\"");
    }

    @ParameterizedTest
    @ValueSource(strings = {"A1243SuuW","Acr","","AAw22321536","qwertyuio"})
    void validateRuleThreeTest(String password)
    {
        assertTrue(UserRegistration.validateRuleThree(password),"Test failed for input:\""+password+"\"");
        System.out.println("Test passed for input :\""+password+"\"");
    }

    @ParameterizedTest
    @ValueSource(strings = {" ","12A34@12","AW21@#$ "," AQW1qwerty"})
    void validateRuleFourTest(String password)
    {
        assertTrue(UserRegistration.validateRuleFour(password),"Test failed for input:\""+password+"\"");
        System.out.println("Test passed for input :\""+password+"\"");
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
            "abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    void validEmailTest(String email)
    {
        assertTrue(UserRegistration.validEmail(email),email+" Invalid or Duplicate" );
        System.out.println(email+" Valid & Added ");
    }

}