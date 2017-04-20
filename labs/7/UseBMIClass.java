// File: UseBMIClass.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Also part of Exercise 10.2
// Due date: April 20th, 2017
// Version 1.0

public class UseBMIClass {
	public static void main(String[] args) {
		BMIClass bmi1 = new BMIClass("Leslie Flores", 18, 137, 5, 2);
		System.out.println("The BMI for " + bmi1.getName() + " is "
			+ bmi1.getBMI() + " - " + bmi1.getStatus());

		BMIClass bmi2 = new BMIClass("Esther Hamberg", 155, 60);
		System.out.println("The BMI for " + bmi2.getName() + " is "
			+ bmi2.getBMI() + " - " + bmi2.getStatus());
	}
}