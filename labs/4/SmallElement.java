// File: SmallElement.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Find the smallest element (Exercise 7.9)
// Due date: March 9th, 2017
// Version 1.0

import java.util.Scanner;

public class SmallElement{
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] num = new double[10];

		System.out.println("Enter your ten numbers here: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextDouble();
		}
		System.out.println("The minimum number is: " + min(num));
	}
	public static double min(double[] array) {
		double min = array[0];
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}
}