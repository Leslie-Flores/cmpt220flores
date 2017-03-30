// File: Driver_prj1
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Making a Convolution (Project 1)
// Due date: March 30th, 2017
// Version 1.0

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		int[] vFirst = new int[input.nextInt()];
    int[] vSecond = new int[input.nextInt()];
    System.out.println();
    for (int i = 0; i < vFirst.length; i++) {
			vFirst[i] = input.nextInt();
    }
    for (int i = 0; i < vSecond.length; i++) {
			vSecond[i] = input.nextInt();
    }
  }

  public static int[] convolveVectors(int[] vFirst, int[] vSecond) {
    int[] vResult = new int[(vFirst.length + vSecond.length) - 1];
    for (int i = 0; i < vFirst.length; i--){
      System.out.print(vFirst.length); 
    }
    return vResult;  
  }

}