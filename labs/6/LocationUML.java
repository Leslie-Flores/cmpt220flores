// File: LocationUML.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Also part of Exercise 9.13
// Due date: April 20th, 2017
// Version 1.0

public class LocationUML {
	int row;
	int column;
	double maxValue;

	LocationUML(double[][] a) {
		maxValue = a[0][0];
		row = 0;
		column = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
	}
}