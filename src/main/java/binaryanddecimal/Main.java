package binaryanddecimal;

public class Main {

    public static void main(String[] args) {


        DecimalToBinary.decToBinRecursive(10);
        System.out.println();

        System.out.println();

        long start = System.nanoTime();
        DecimalToBinary.decToBin(10);
        System.out.println();
        long end = System.nanoTime();
        System.out.println(end - start);

        BinaryToDecimal.binToDec("11011");
        System.out.println();



        System.out.println(BinaryToDecimal.getDecimal(11011));


        System.out.println(BinaryToDecimal.toDecimal2("11011"));


        System.out.println();
        System.out.println(BinaryToDecimal.toDecimalUsingParseInt("11011"));

    }
}
