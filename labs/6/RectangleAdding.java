// File: RectangleAdding.png
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Also in junction with Exercise 9.1
// Due date: April 20th, 2017
// Version 1.0

public class RectangleAdding {
	double width;
	double height;
  
	RectangleAdding() {
		width = 1;
		height = 1;
	} 

	RectangleAdding(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	double getArea() {
		return width * height; 
	}

	double getPerimeter() {
		return 2 * (width + height);
	}
}