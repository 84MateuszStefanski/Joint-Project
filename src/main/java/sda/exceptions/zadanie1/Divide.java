package sda.exceptions.zadanie1;

public class Divide {

    public static double divide(double a, double b) throws CannotDivideBy0Exception {
        if (b==0){
            throw  new CannotDivideBy0Exception("Cannot divide by zero");
        }else
            return a/b;
    }
}
