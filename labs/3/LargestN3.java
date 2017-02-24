// File: LargestN3.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Problem 5.13
// Due date: February 23rd, 2017
// Version 1.0

public class LargestN3 {
	public static void main(String[] args) {
		int n = 0;
		while (Math.pow(n + 1, 3) <= 12000) {
			n++;
		}
		System.out.println("The largest integer n of n^3 is less "
		+ "than 12,000 is " + n + ".");
	}
}