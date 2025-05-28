package com.bridgelabz.userregistrationtesting;

public class UserRegistration
{
    // UC-1: Method to validate first name with first capital letter and minimum 3 characters
    public static boolean validateFirstName(String firstName)
    {
        // Regex: starts with capital letter, followed by at least two letters
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    // UC-2: Method to validate second name (same rule as first name)
    public static boolean validateLastName(String secondName)
    {
        return secondName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    // UC-3: Method to validate email
    public static boolean validateEmail(String email)
    {
        // Regex to validate email format
        return email.matches("^[a-zA-Z0-9]+([._+-]+[a-zA-Z0-9])?@[a-zA-Z0-9]+[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2,})?$");
    }

    // UC-4: Method to validate mobile number (format: country code space 10-digit number)
    public static boolean validateMobileNumber(String mobileNumber)
    {
        return mobileNumber.matches("^[0-9]{2,}\\s[0-9]{10}");
    }

    // UC-5: Validate password (Rule 1: Minimum 8 characters, no whitespace)
    public static boolean validateRuleOne(String passwordRuleOne)
    {
        return passwordRuleOne.matches("^[^\\s]{8,}");  // At least 8 non-whitespace characters
    }

}
