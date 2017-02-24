// File: SortThreeInt.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Sort Three Integers in Order
// Due date: February 9th, 2017
// Version 1.0

 import java.util.Scanner;
 
 public class SortThreeInt{
   public static void main (String[] args){
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter your first integer here. ");
	   int a = input.nextInt();
	   System.out.print("Enter your second integer here. ");
	   int b = input.nextInt();
	   System.out.print("Enter your third integer here. ");
	   int c = input.nextInt();
	   
	   if (a > b && a > c){
		   if (b > c){
			   System.out.println("Your three intergers in order are " 
			   + c + ", " + b + ", and " + a + ".");
		   }
		   else{
			   System.out.println("Your three intergers in order are " 
			   + b + ", " + c + ", and " + a + ".");
		   }
	   }
	   else if (b > a && b > c){
		   if (a > c){
			   System.out.println("Your three intergers in order are " 
			   + c + ", " + a + ", and " + b + ".");
		   }
		   else{
			   System.out.println("Your three intergers in order are " 
			   + a + ", " + c + ", and " + b + ".");
		   }
	   }
	   else if (c > a && c > b){
		   if (a > b){
			   System.out.println("Your three intergers in order are " 
			   + b + ", " + a + ", and " + c + ".");
		   }
		   else{
			   System.out.println("Your three intergers in order are " 
			   + a + ", " + b + ", and " + c + ".");
		   }
	   }
   }
 }