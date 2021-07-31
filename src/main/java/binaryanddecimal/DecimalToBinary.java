package binaryanddecimal;

public class DecimalToBinary {

    //recursive method
    public static void decToBinRecursive(int n) {
        //divide until number reduces to 0
        if (n > 0) {
            decToBinRecursive(n / 2);            //recursive call with quotient
            System.out.print(n % 2);    //print remainder
        }
    }

    //Divide by 2 until number reduces to 0
    public static void decToBin(int num){
        int i=1, binary=0, rem;
		while(num!=0) {
            rem = num % 2;
            binary += i * rem;    //concatenate remainders in bottom-up manner
            num = num / 2;
            i = i * 10;
        }
        System.out.println("Binary: "+ binary);
    }
}

