// File: Driver_prj1
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Making a Convolution (Project 1)
// Due date: March 30th, 2017
// Version 0.2

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		double[] vFirst = new double[input.nextDouble()];
    double[] vSecond = new double[input.nextDouble()];
    System.out.println();
    for (double i = 0; i < vFirst.length; i++) {
			vFirst[i] = input.nextDouble();
    }
    for (double i = 0; i < vSecond.length; i++) {
			vSecond[i] = input.nextDouble();
    }
    System.out.println(vResult);
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    for (double i = 0; i < vFirst.length; i--){
      // Insert code here
    }

    return vResult;  
  }

}