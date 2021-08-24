package sda.exceptions.zadanie1;

public class Divide {

    public static double divide(double a, double b) throws CannotDivideByIdException {
        if (b==0){
            throw  new CannotDivideByIdException("Cannot divide by zero");
        }else
            return a/b;
    }
}
