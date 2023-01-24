package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
	/**
	* Test The constructor with a valid binary vallue
	*/
	@Test
	public void normalConstructor()
	{
		Binary binary=new Binary("1001001");
	assertTrue( binary.getValue().equals("1001001"));
	}
	/**
	* Test The constructor with an invalid binary value of out-of-range digits
	*/
	@Test
	public void constructorWithInvalidDigits()
	{
		Binary binary=new Binary("1001001211");
	assertTrue( binary.getValue().equals("0"));
	}
	/**
	* Test The constructor with an invalid binary value of alphabetic characters
	*/
	@Test
	public void constructorWithInvalidChars()
	{
		Binary binary=new Binary("1001001A");
	assertTrue( binary.getValue().equals("0"));
	}
	/**
	* Test The constructor with an invalid binary value that has a sign
	*/
	@Test
	public void constructorWithNegativeSign()
	{
		Binary binary=new Binary("-1001001");
	assertTrue( binary.getValue().equals("0"));
	}
	/**
	* T	est The constructor with a zero tailing valid binary value
	*/
	@Test
	public void constructorWithZeroTailing()
	{
		Binary binary=new Binary("00001001");
	assertTrue( binary.getValue().equals("1001"));
	}
	/**
	* Test The constructor with an empty string
	*/
	@Test
	public void constructorEmptyString()
	{
		Binary binary=new Binary("");
	assertTrue( binary.getValue().equals("0"));
	}
	/**
	* Test The add functions with two binary numbers of the same length
	*/
	@Test
	public void add()
	{
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
	assertTrue( binary3.getValue().equals("10111"));
	}
	/**
	* Test The add functions with two binary numbers, the length of the first argument is less than the second
	*/
	@Test
	public void add2()
	{
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
	assertTrue( binary3.getValue().equals("1101"));
	}
	/**
	* Test The add functions with two binary numbers, the length of the first argument is greater than the second
	*/
	@Test
	public void add3()
	{
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
	assertTrue( binary3.getValue().equals("1101"));
	}
	/**
	* Test The add functions with a binary numbers with zero
	*/
	@Test
	public void add4()
	{
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
	assertTrue( binary3.getValue().equals("1010"));
	}
	/**
	* Test The add functions with two zeros
	*/
	@Test
	public void add5()
	{
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
	assertTrue( binary3.getValue().equals("0"));
	}

	// MULTIPLICATION TESTS
	// Test the multiplication function with two 4 digit binary numbers
	@Test
	public void mult() {
		Binary binary1 = new Binary("1100");
		Binary binary2 = new Binary("1001");
		Binary binary3 = Binary.binaryMultiply(binary1, binary2);
		assertTrue(binary3.getValue().equals("1101100"));
	}
			   
	// Test the multiplication function with the same binary number
	@Test
	public void mult2() {
		Binary binary1 = new Binary("1000");
		Binary binary2 = new Binary("1000");
		Binary binary3 = Binary.binaryMultiply(binary1, binary2);
		assertTrue(binary3.getValue().equals("1000000"));
	}
			   
	// Test the multiplication function with a binary number and one
	@Test
	public void mult3() {
		Binary binary1 = new Binary("1000");
		Binary binary2 = new Binary("1");
		Binary binary3 = Binary.binaryMultiply(binary1, binary2);
		assertTrue(binary3.getValue().equals("1000"));
	}
	   
	// Test the multiplication function with a binary number and zero
	@Test
	public void mult4() {
		Binary binary1 = new Binary("1000");
		Binary binary2 = new Binary("0");
		Binary binary3 = Binary.binaryMultiply(binary1, binary2);
		assertTrue(binary3.getValue().equals("0"));
	}
	
	// Test the multiplication function with two zeroes
	@Test
	public void mult5() {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("0");
		Binary binary3 = Binary.binaryMultiply(binary1, binary2);
		assertTrue(binary3.getValue().equals("0"));
	}

	@Test 
	public void Testcases() {
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
