package sda.interfaces.zadanie4;

import java.util.Scanner;

public class UserCreator {
    private final Scanner scanner = new Scanner(System.in);

    public User createUser(){
        User user = new User();

        System.out.println("Enter your name and press enter");
        user.setName(scanner.nextLine(), new Validator<String>() {
            @Override
            public boolean validate(String input) {
                if (input == null || input.isEmpty() || Character.isLowerCase(input.charAt(0))) {
                    return false;
                }
                return true;
            }
        });
        System.out.println("Enter your last name and press enter");
      //todo tu skonczone  user.getAge()

        return user;
    }
}
