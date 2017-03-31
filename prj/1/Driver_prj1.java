// File: Driver_prj1
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Making a Convolution (Project 1)
// Due date: March 30th, 2017
// Version 1.1

// DON'T FORGET TO INCLUDE MEANINGFUL COMMENTS

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int svf = input.nextInt();
    int svs = input.nextInt();

    double[] vFirst = new double[svf];
    double[] vSecond = new double[svs];

    for (int i = 0; i < svf; i++)
      vFirst[i] = input.nextDouble();
    
    for (int i = 0; i < svs; i++)
      vSecond[i] = input.nextDouble();

    double[] vector = convolveVectors(vFirst, vSecond);
    
    for (int i = 0; i < vector.length; i++)
      System.out.print(Math.round(vector[i]) + " ");
  }

  public static int[] convolveVectors(int[] vFirst, int[] vSecond) {
    int[] vResult = new int[(vFirst.length + vSecond.length) - 1];
    for (int idx = 0; idx < vResult.length; idx++){
      for (int shift = 0; shift < vSecond.length; shift++){
        if (((idx - shift) >= 0) && ((idx - shift) < vFirst.length))
         vResult[idx] += vFirst[idx - shift] * vSecond[shift];
      }
    }
    return vResult;  
  }
}