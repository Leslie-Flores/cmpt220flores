// File: VehiclePlates.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Generate vehicle plate numbers (Lab 2)
// Due date: February 23rd, 2017
// Version 1.0

public class VehiclePlates{
	public static void main (String[] args){
		int letter1 = 65 + (int)(Math.random() * (90 - 65));
		int letter2 = 65 + (int)(Math.random() * (90 - 65));
		int letter3 = 65 + (int)(Math.random() * (90 - 65));	

		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		int number4 = (int)(Math.random() * 10);

		System.out.println("" + (char)(letter1) + ((char)(letter2)) + 
		((char)(letter3)) + number1 + number2 + number3 + number4);
	}
}