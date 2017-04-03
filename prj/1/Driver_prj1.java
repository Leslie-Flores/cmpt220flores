// File: Driver_prj1
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Making a Convolution (Project 1)
// Due date: March 30th, 2017
// Version 1.5

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    int svf = input.nextInt(); // here it is asking for the lengths of input
    int svs = input.nextInt();

    double[] vFirst = new double[svf]; // here it is asking for the inputs
    double[] vSecond = new double[svs];

    for (int i = 0; i < svf; i++) // checking for the length of vFirst
      vFirst[i] = input.nextDouble();
    
    for (int i = 0; i < svs; i++) // checking for the length of vSecond
      vSecond[i] = input.nextDouble();

    double[] vector = convolveVectors(vFirst, vSecond); // Where a double/int conversion issue occurs
    
    for (int i = 0; i < vector.length; i++) // Doesn't work due to issue lised above
      System.out.print(Math.round(vector[i]) + " "); // prints out the answers to project 1
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    for (int idx = 0; idx < vResult.length; idx++){ // checks to see if index is less than vResult length
      for (int shift = 0; shift < vSecond.length; shift++){ // checks to see if the shift goes through all values of vSecond
        if (((idx - shift) >= 0) && ((idx - shift) < vFirst.length)) // functions is here to avoid out of bounds issues
         vResult[idx] += vFirst[idx - shift] * vSecond[shift]; // this is where the list shifts to convolve
      }
    }
    return vResult; // sends the results to be printed
  }
}