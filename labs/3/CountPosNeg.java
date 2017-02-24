// File: CountPosNeg.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Problem 5.1
// Due date: February 23rd, 2017
// Version 1.0

import java.util.Scanner;

public class CountPosNeg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pos = 0, neg = 0, count = 0;
		double total = 0, average;
		
		System.out.print("Enter an integer (ends if it is 0): ");
	    int number = input.nextInt();

		do {
		    if (number == 0){
				System.out.println("You cannot enter 0. Try again.");
			    System.exit(1);
		    }
			
			if (number > 0)
				pos++;
			else
				neg++;
			    total += number;	
			    count++;
			    number = input.nextInt();
		} while (number != 0);

		average = total / count;

		System.out.println(
			"The number of positive is " + pos +
			"\nThe number of negatives is " + neg +
			"\nThe total is total " + total +
			"\nThe average is " + average);
	}
}