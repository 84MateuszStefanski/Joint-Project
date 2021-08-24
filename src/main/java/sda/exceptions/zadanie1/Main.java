package sda.exceptions.zadanie1;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(Divide.divide(10, 0));
        } catch (CannotDivideByIdException e) {
            e.printStackTrace();
        }
    }
}
