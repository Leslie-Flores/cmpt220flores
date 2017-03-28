// File: PartitionList
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Partition of a list (Exercise 7.32)
// Due date: March 30th, 2017
// Version 1.0

import java.util.Scanner;

public class PartitionList{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("First number is the size of array and the second number is the pivot.");
        System.out.print("Enter your list here accordingly: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++)
          list[i] = input.nextInt();
        partition(list);
    }
    
    public static int partition(int[] list) {
        int first = 0;
        int low = first + 1;
        int high = list.length - 1;
        int pivot = list[first];

        while (high > low) {
            while (low <= high && list[low] <= pivot) low++;
            while (low <= high && list[high] > pivot) high--;

            if (high > low) {
              int temp = list[high];
              list[high] = list[low];
              list[low] = temp;
            }
        }
        while (high >= low && list[high] >= pivot) high--;
        
        if (high > first) {
            int temp = list[high];
            list[high] = list[first];
            list[first] = temp;
            return high;
        } 
        else {
            return first;
    }
  }
}