package com.bridgelabz.userregistrationtesting;

public class UserRegistration
{
    // UC-1: Method to validate first name with first capital letter and minimum 3 characters
    public static boolean validateFirstName(String firstName)
    {
        // Regex: starts with capital letter, followed by at least two letters
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
}
