package com.bridgelabz.userregistrationtesting;

import java.util.HashSet;
import java.util.Set;

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

    // UC-6: Validate password (Rule 2: At least one uppercase letter)
    public static boolean validateRuleTwo(String passwordRuleTwo)
    {
        return passwordRuleTwo.matches("^(?=.*[A-Z])[^\\s]{8,}$"); // At least one uppercase, 8+ chars
    }

    // UC-7: Validate password (Rule 3: At least one numeric digit and one uppercase letter)
    public static boolean validateRuleThree(String passwordRuleThree)
    {
        return passwordRuleThree.matches("(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$");
    }

    // UC-8: Validate password (Rule 4: Exactly one special character along with previous rules)
    public static boolean validateRuleFour(String passwordRuleFour)
    {
        // Explanation: at least one uppercase, one digit, exactly one special character, no spaces
        return passwordRuleFour.matches("^(?=.*[A-Z])(?=.*[0-9])(?=^[^\\W_\\s]*[\\W_][^\\W_\\s]*$)\\S{8,}$");
    }

    // UC-9: Reusable method to validate emails (same as UC-3, could be improved by avoiding duplication)
    // Set to store previously validated (unique) email addresses
    private static final Set<String> emailSet = new HashSet<>();
    public static boolean validEmail(String email)
    {
        String emailRegex= ("^[a-zA-Z0-9]+([._+-]+[a-zA-Z0-9])?@[a-zA-Z0-9]+[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2,})?$");
        // Normalize to lowercase to avoid case-sensitive duplicates
        email = email.toLowerCase();

        // Check format and duplication
        if (email.matches(emailRegex) && !emailSet.contains(email)) {
            emailSet.add(email); // Store the email as validated
            return true;
        }
        return false; // Invalid format or duplicate
    }

}
