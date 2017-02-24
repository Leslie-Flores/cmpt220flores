// File: ASCIIcode.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: ASCII Code (Lab 2)
// Due date: February 23rd, 2017
// Version 1.0

import java.util.Scanner;

public class ASCIIcode{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		int numbToCon = input.nextInt();
		char ascii = (char) numbToCon;
		
		System.out.println("The character for ASCII code " + numbToCon + " is " + ascii + ".");
	}
}