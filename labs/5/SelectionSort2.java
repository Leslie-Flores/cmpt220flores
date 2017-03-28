// File: SelectionSort2
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Revise selection sort (Exercise 7.20)
// Due date: March 30th, 2017
// Version 1.0

import java.util.Scanner;

public class SelectionSort2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
		double[] nums = new double[10];
		System.out.println("Enter your ten numbers here: ");
    
		for (int i = 0; i < nums.length ; i++)
			nums[i] = input.nextDouble();
		selSort(nums);

		for (double e: nums) 
			System.out.print(e + " ");
		System.out.println();
	}

	public static void selSort(double[] list) {
		for (int i = list.length - 1; i >= 0; i--) {
			double currMax = list[i];
			int currMaxIndex = i;

			for (int j = i - 1; j >= 0; j--) {
				if (currMax < list[j]) {
					currMax = list[j];
					currMaxIndex = j;
				}
			}
      
			if (currMaxIndex != i) {
				list[currMaxIndex] = list[i];
				list[i] = currMax;
			}
		}
  }
}