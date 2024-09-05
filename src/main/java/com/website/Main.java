package com.website;
import java.util.Random;

public class Main {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    private static final String ALL_CHARS = LOWERCASE+UPPERCASE+DIGITS+SPECIAL_CHARS;
    private static String password = new String();

    private static String passwordGenerator(int length){
        Random rd = new Random();
        int a = rd.nextInt(ALL_CHARS.length());
        password = ALL_CHARS.substring(a,a+length);
        return password;
    }

    public static void main(String[] args) {
        System.out.println(passwordGenerator(10));
    }
}

