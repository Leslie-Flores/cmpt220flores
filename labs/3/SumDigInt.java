// File: SumDigInt.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Suming up the digits in an integer
// Due date: February 23rd, 2017
// Version 1.0

import java.util.Scanner;

public class SumDigInt{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your integer here: ");
		int num = input.nextInt();
		System.out.println("The sum of the digits in " + num + " is " + sumDigits(num) + ".");
	}
	public static int sumDigits(long n) {
		int sum = 0;
		while (n > 0){
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}