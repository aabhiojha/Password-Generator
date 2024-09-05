package com.website;

import java.security.SecureRandom;
import java.util.Random;
//This class provides a cryptographically strong random number generator (RNG).
// Better
public class Main {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    private static final String ALL_CHARS = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARS;

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        String generatedPassword = "";
        for (int i = 0; i <= 10; i++) {
            int a = random.nextInt(ALL_CHARS.length());

            //methods to join two strings
            generatedPassword = generatedPassword.concat(Character.toString(ALL_CHARS.charAt(a)));
            //        generatedPassword += ALL_CHARS.charAt(a);
        }

        System.out.println(generatedPassword);
    }
}

