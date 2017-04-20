// File: RectangleClass.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: The Rectangle Class(Exercise 9.1)
// Due date: April 20th, 2017
// Version 1.0

public class RectangleClass {
	public static void main(String[] args) {
		RectangleAdding rectangle1 = new RectangleAdding(4, 40);
		RectangleAdding rectangle2 = new RectangleAdding(3.5, 35.9);
		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle1.width);
		System.out.println("Height:    " + rectangle1.height);
		System.out.println("Area:      " + rectangle1.getArea());
		System.out.println("Perimeter: " + rectangle1.getPerimeter());

		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle2.width);
		System.out.println("Height:    " + rectangle2.height);
		System.out.println("Area:      " + rectangle2.getArea());
		System.out.println("Perimeter: " + rectangle2.getPerimeter());
	}
}