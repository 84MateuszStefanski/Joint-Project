package sda.interfaces.zadanie1;

import java.util.regex.Pattern;

public class UserValidator {



    public String[] validateEmails(String email, String alternativeEmail){

        class Email{
            private String email;

            public Email(String email) {
                if (email == null || email.isEmpty() || !validate(email)){
                    this.email="Unknown";
                }else {
                this.email = email;
                }
            }
        }

        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);
        return new String[]{email1.email,email2.email};
    }

    private static boolean validate(String email) {
        Pattern checker = Pattern.compile("[A-Z0-9a-z._%+-/]+@[A-Za-z0-9.-]+.[A-Za-z]{2,64}");
        boolean validator = checker.matcher(email).matches();
        return validator;
    }

}
