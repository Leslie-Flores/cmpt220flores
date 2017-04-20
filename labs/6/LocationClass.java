// File: LocationClass.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: The Location Class(Exercise 9.13)
// Due date: April 20th, 2017
// Version 1.0

import java.util.Scanner;

public class LocationClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();

		double[][] array = new double[rows][columns]; 
		System.out.println("Enter the array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}

		LocationUML max = locateLargest(array);

		System.out.println("The location of the largest element is " +
			max.maxValue + " at (" + max.row + ", " + max.column + ")");
	}

	public static LocationUML locateLargest(double[][] a) {
		return new LocationUML(a);
	}
}
