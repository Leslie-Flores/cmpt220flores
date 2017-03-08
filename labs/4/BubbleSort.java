// File: BubbleSort.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Bubble Sort (Exercise 7.18)
// Due date: March 9th, 2017
// Version 1.0

import java.util.Scanner;

public class BubbleSort{
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] num = new double[10];
		System.out.println("Enter your ten numbers here: ");
		for (int i = 0; i < num.length; i++)
			num[i] = input.nextDouble();

		bubbleSort(num);
    System.out.print("Your numbers are now sorted: ");
    
		for (double e: num) {
			System.out.print(e + " ");
		}
	}
	public static void bubbleSort(double[] list) {
		double tmpr;
		boolean swapped;

		do {
			swapped = false; 
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] > list[i + 1]) {
					tmpr = list[i];
					list[i] = list[i + 1];
					list[i + 1] = tmpr;
					swapped = true;
				}
			}
		} while (swapped);
	}
}