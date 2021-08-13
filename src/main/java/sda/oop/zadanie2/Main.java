package sda.oop.zadanie2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Maćko","Z Bogdańca");
        System.out.println(person.toString());

        Person student = new Student(
                "Janek",
                "Raszyn",
                "Socjologia",
                "2021",
                new BigDecimal("10000"));

        Person lecturer = new Lecturer(
                "Lejb",
                "TelAviv",
                "Prawo",
                new BigDecimal("100000"));

        System.out.println(student);
    }
}
