// File: Driver_prj1
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Making a Convolution (Project 1)
// Due date: March 30th, 2017
// Version 0.1

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		int[] vFirst = new int[input.nextInt()];
    System.out.println();
    int[] vSecond = new int[input.nextInt()];
    System.out.println();
    for (int i = 0; i < vFirst.length; i++) {
			vFirst[i] = input.nextInt();
    }
    System.out.println();
    for (int i = 0; i < vSecond.length; i++) {
			vSecond[i] = input.nextInt();
    }
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    // write your code here

    return vResult;  
  }

}