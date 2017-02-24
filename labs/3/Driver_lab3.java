// File: Driver_lab3.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Driver_labs3
// Due date: February 23rd, 2017
// Version 1.0

import java.util.Scanner;

public class Driver_lab3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		while (true){
			double x1 = input.nextDouble();
			if (x1 == 0.0)
				break;
		    double y1 = input.nextDouble();
		    double x2 = input.nextDouble();
		    double y2 = input.nextDouble();
		    double p  = input.nextDouble();
		
		    double res = 0.0;
	 	    res = Math.pow(Math.pow(Math.abs(x1 - x2),p) 
		        + Math.pow(Math.abs(y1 - y2),p), 1.0/p);
			
	 	    System.out.println(res);
		}
	}
}