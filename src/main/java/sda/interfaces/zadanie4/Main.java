package sda.interfaces.zadanie4;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        user.setName("John", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                if (input == null || input.isEmpty() || Character.isLowerCase(input.charAt(0))) {
                    return false;
                }
                return true;
            }
        });


    }
}
