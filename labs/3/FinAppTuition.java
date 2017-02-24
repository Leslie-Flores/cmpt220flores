// File: FinAppTuition.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Problem 5.7
// Due date: February 23rd, 2017
// Version 1.0

public class FinAppTuition {
	public static void main(String[] args) {
		int total = 0, tuition = 10000, tuition10 = 0;

		for (int year = 1; year <= 14; year++){
			tuition += (tuition * 0.05);  
			if (year > 10){
				total += tuition;
			}
			if (year == 10){
			    tuition10 = tuition;
			}			
        }	
		System.out.println("Tuition in ten years: $" + tuition10);
		System.out.println("Total cost for four years after the "
		+ "tenth year: $" + total);
	}
}