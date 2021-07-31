package binaryanddecimal;

public class BinaryToDecimal {

    int binaryNum;
    int result;

    private BinaryToDecimal (int binaryNum) {
        this.binaryNum = binaryNum;
    }

    public static int binaryToDecimal (int binaryNum) {


        return 0;
    }

    public static void binToDec(String binaryString){
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println(decimal);
    }

    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    public static int toDecimal2 (String binar) {
        int power = 0;
        int result = 0;
        for (int i = binar.length() - 1; i >=0; i--){
            if (binar.charAt(i) == '1') {
                result += Math.pow(2, power);
            }
            power++;
        }


        return result;
    }


    public static int toDecimalUsingParseInt(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }

}
