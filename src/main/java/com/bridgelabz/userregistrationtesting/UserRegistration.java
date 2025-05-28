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

}
