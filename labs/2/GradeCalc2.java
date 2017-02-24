// File: GradeCalc2.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Grade Calculator 2
// Due date: February 9th, 2017
// Version 2.0

import java.util.Scanner;

public class GradeCalc2 {
  public static void main (String[] args){
	  Scanner input = new Scanner(System.in);
      System.out.println("Please enter the following as a percentage... ");
      System.out.print("Midterm Grade: ");
      int midGrade = input.nextInt();
      System.out.print("Final Exam: ");
      int finGrade = input.nextInt();
      System.out.print("Projects: ");
      int proGrade = input.nextInt();
      System.out.print("Homework and Labs: ");
      int hwlabGrade = input.nextInt();
      double rawGrade = (midGrade * 0.20) + (finGrade * 0.20) 
	    + (proGrade * 0.20) + (hwlabGrade * 0.40);
	  
	  if (rawGrade >= 95){
		  System.out.println("Your final grade is: A");
	  }
	  else if (rawGrade >= 90){
		  System.out.println("Your final grade is: A-");
	  }
	  else if (rawGrade >= 87){
		  System.out.println("Your final grade is: B+");
	  }
	  else if (rawGrade >= 83){
		  System.out.println("Your final grade is: B");
	  }
	  else if (rawGrade >= 80){
		  System.out.println("Your final grade is: B-");
	  }
	  else if (rawGrade >= 77){
		  System.out.println("Your final grade is: C+");
	  }
	  else if (rawGrade >= 73){
		  System.out.println("Your final grade is: C");
	  }
	  else if (rawGrade >= 70){
		  System.out.println("Your final grade is: C-");
	  }
	  else if (rawGrade >= 65){
		  System.out.println("Your final grade is: D+");
	  }
	  else if (rawGrade >= 60){
		  System.out.println("Your final grade is: D");
	  }
	  else {
		  System.out.println("Your final grade is: F");
	  }
  }
}