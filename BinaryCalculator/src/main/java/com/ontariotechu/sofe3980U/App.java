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
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        // SUM
        Binary binary1 = new Binary("00010001000");
        System.out.println("First binary number is " + binary1.getValue());

        Binary binary2 = new Binary("111000");
        System.out.println("Second binary number is " + binary2.getValue());

        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Their summation is " + sum.getValue());

        // BITWISE LOGICAL OR
        Binary binary3 = new Binary("1010");
        System.out.println("Third binary number is " + binary3.getValue());

        Binary binary4 = new Binary("100100");
        System.out.println("Fourth binary number is " + binary4.getValue());

        Binary logicalOR = Binary.bitwiseLogicalOR(binary3, binary4);
        System.out.println("Their logical OR is " + logicalOR.getValue());

        // BITWISE LOGICAL AND
        Binary binary5 = new Binary("111000");
        System.out.println("Fifth binary number is " + binary5.getValue());

        Binary binary6 = new Binary("101001");
        System.out.println("Sixth binary number is " + binary6.getValue());

        Binary logicalAND = Binary.bitwiseLogicalAND(binary5, binary6);
        System.out.println("Their logical AND is " + logicalAND.getValue());
    }

}
