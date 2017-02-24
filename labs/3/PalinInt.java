// File: PalinInt.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Palindrome Integer
// Due date: February 23rd, 2017
// Version 1.0

import java.util.Scanner;

public class PalinInt{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer here: ");
		int number = input.nextInt();
		System.out.println(number + (isPalin(number) ? " is " : " is not ") + "a palindrome.");
	}
	public static boolean isPalin(int number){
		return number == reverse(number) ? true : false;
	}
	public static int reverse(int number){
		String reverse = "";
		String n = number + "";
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse);
	}
}