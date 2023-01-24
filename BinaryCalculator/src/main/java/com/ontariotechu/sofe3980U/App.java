package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * Main program: The entry point of the program. The local time will be printed
     * first,
     * Then it will create two binary variables, add them and print the result.
     *
     * @param args: not used
     */
    public static void main(String[] args) {
        // LocalTime currentTime = new LocalTime();
        // System.out.println("The current local time is: " + currentTime);

        // // SUM
        // Binary binary1 = new Binary("00010001000");
        // System.out.println("First binary number is " + binary1.getValue());

        // Binary binary2 = new Binary("111000");
        // System.out.println("Second binary number is " + binary2.getValue());

        // Binary sum = Binary.add(binary1, binary2);
        // System.out.println("Their summation is " + sum.getValue());

        // BITWISE LOGICAL OR

        // First test function
        Binary binary3 = new Binary("1010");
        System.out.println("Third binary number is " + binary3.getValue());

        Binary binary4 = new Binary("100100");
        System.out.println("Fourth binary number is " + binary4.getValue());

        Binary logicalOR1 = Binary.bitwiseLogicalOR(binary3, binary4);
        System.out.println("Their logical OR is " + logicalOR1.getValue());

        System.out.println("");

        // Second test function
        Binary binary5 = new Binary("101010");
        System.out.println("Fifth binary number is " + binary5.getValue());

        Binary binary6 = new Binary("110100");
        System.out.println("Sixth binary number is " + binary6.getValue());

        Binary logicalOR2 = Binary.bitwiseLogicalOR(binary5, binary6);
        System.out.println("Their logical OR is " + logicalOR2.getValue());

        System.out.println("");

        // Third test function
        Binary binary7 = new Binary("111000");
        System.out.println("Third binary number is " + binary7.getValue());

        Binary binary8 = new Binary("100100");
        System.out.println("Fourth binary number is " + binary8.getValue());

        Binary logicalOR3 = Binary.bitwiseLogicalOR(binary7, binary8);
        System.out.println("Their logical OR is " + logicalOR3.getValue());

        System.out.println("");

        // BITWISE LOGICAL AND

        // First test function
        Binary binary9 = new Binary("10111");
        System.out.println("Ninth binary number is " + binary9.getValue());

        Binary binary10 = new Binary("10101011");
        System.out.println("Tenth binary number is " + binary10.getValue());

        Binary logicalAND1 = Binary.bitwiseLogicalAND(binary9, binary10);
        System.out.println("Their logical AND is " + logicalAND1.getValue());

        System.out.println("");

        // Second test function
        Binary binary11 = new Binary("0011");
        System.out.println("Eleventh binary number is " + binary11.getValue());

        Binary binary12 = new Binary("1010");
        System.out.println("Twelth binary number is " + binary12.getValue());

        Binary logicalAND2 = Binary.bitwiseLogicalAND(binary11, binary12);
        System.out.println("Their logical AND is " + logicalAND2.getValue());

        System.out.println("");

        // Third test function
        Binary binary13 = new Binary("11111");
        System.out.println("Thirteenth binary number is " + binary13.getValue());

        Binary binary14 = new Binary("0");
        System.out.println("Fourteenth binary number is " + binary14.getValue());

        Binary logicalAND3 = Binary.bitwiseLogicalAND(binary13, binary14);
        System.out.println("Their logical AND is " + logicalAND3.getValue());
        
        // MULTIPLICATION
        Binary multBinary1 = new Binary("1010");
        System.out.println("Binary multiplicand is " + multBinary1.getValue());

        Binary multBianry2 = new Binary("0101");
        System.out.println("Binary multiplier is " + multBianry2.getValue());

        Binary product = Binary.binaryMultiply(multBinary1, multBianry2);
        System.out.println("The product is " + product.getValue());
    }

}
