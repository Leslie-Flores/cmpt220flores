// Leslie Flores
// February 8th, 2017
// Geometry: finding the area of a reg. polygon

import java.util.Scanner;

public class PolygonArea{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int sides = input.nextInt();
		System.out.print("Enter the side length: ");
		double length = input.nextDouble();
		
		double area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
		//area = Math.floor(area * 100)/100;
		
		System.out.println("The area of the polygon is " + area + ".");
	}
}