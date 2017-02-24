// File: PentagonArea.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Pentagon Area
// Due date: February 9th, 2017
// Version 1.0

import java.util.Scanner;

public class PentagonArea{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex: ");
		double radius = input.nextDouble();
		
		double side = 2 * radius * Math.sin(Math.PI / 5);
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
	    area = Math.floor(area * 100) / 100;
		
		System.out.println("The area of a pentagon is " + area + ".");
	}
}
