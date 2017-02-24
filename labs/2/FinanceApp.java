// File: FinanceApp.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Financial Application - Monetary units (Lab 2)
// Due date: February 23rd, 2017
// Version 1.0

import java.util.Scanner;

public class FinanceApp{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a money amount in dollars: ");
		String amount = input.nextLine();
		String oneDollars = amount.substring(0, amount.indexOf('.'));

		int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
		int quarters = cents / 25;
		cents %= 25;
		int dimes = cents / 10;
		cents %= 10;
		int nickels = cents / 5;
		cents %= 5;

		System.out.println("Your amount " + amount + " consists of\n " 
			+ oneDollars + " dollars\n " 
			+ quarters + " quarters\n "
			+ dimes + " dimes\n "
			+ nickels + " nickels\n "
			+ cents + " pennies\n "
			);
	}
}