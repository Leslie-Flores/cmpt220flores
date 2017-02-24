// File: SmallestN2.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: SmallestN2
// Due date: February 23rd, 2017
// Version 1.0

public class SmallestN2 {
	public static void main(String[] args) {
		int n = 0;
		while (Math.pow(n, 2) <= 12000) {
			n++;
		}
		System.out.println("The smallest n of n^2 that is greater than 12,000 is " + n + ".");
	}
}