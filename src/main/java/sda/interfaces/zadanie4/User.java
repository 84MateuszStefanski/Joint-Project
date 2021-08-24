package sda.interfaces.zadanie4;

public class User {

    private String name;
    private String lastName;
    private int age;
    private String login;
    private String password;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name, Validator<String> validator) {
        if (validator.validate(name)) {
            this.name = name;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName, Validator<String> validator) {
        if (validator.validate(lastName)) {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, Validator<Integer> validator) {
        if (validator.validate(age)) {
            this.age = age;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login, Validator<String> validator) {
        if (validator.validate(login)) {
            this.login = login;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Validator<String> validator) {
        if (validator.validate(password)) {
            this.password = password;
        }
    }
}