package javaprogram0;
/* 17.Write a Java program to convert a decimal number to binary number.
Input Data:
 Input a Decimal Number : 5
Expected Output
Binary number is: 101
*/
public class DecimalToBinary17 {

    public static void main( String[] args ) {
        int decimal = 5;
        // converting to binary and representing it in a string
        String bin = Integer.toBinaryString(decimal);
        System.out.println(bin);
    }
}
