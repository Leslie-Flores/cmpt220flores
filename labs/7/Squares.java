// File: Squares.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Square Numbers (Exercise 10.17)
// Due date: April 20th, 2017
// Version 1.0

import java.math.BigInteger;

public class Squares {
	public static void main(String[] args) {
		BigInteger i = new BigInteger(Long.MAX_VALUE + ""); 
		BigInteger end = i.add(new BigInteger("10"));

		for (i = new BigInteger(Long.MAX_VALUE + ""); 
			i.compareTo(end) <= 0; 
			i = i.add(new BigInteger("1"))) {
			System.out.println(i.multiply(i)); 
		}		
	}
}
