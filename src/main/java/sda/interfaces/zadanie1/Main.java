package sda.interfaces.zadanie1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        String email = "a^^^sdfasf@gmail.com";
        String alternativeEmail = "cok22r@wp.pl";

        String[] validated = new String[2];
        validated = validator.validateEmails(email, alternativeEmail);
        Arrays.stream(validated).forEach(System.out::println);


    }
}
