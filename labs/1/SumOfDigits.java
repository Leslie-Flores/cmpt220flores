// Leslie Flores
// January 25th, 2017
// Exercise 2.6

import java.util.Scanner;

 public class SumOfDigits {
   public static void main(String [] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a number between 0 and 1000: ");
     int inputNum = input.nextInt();
     int result = (inputNum % 10) + ((inputNum / 10) % 10) + (inputNum / 100);
     System.out.println("The sum of the digits is " + result + ".");
 }
}