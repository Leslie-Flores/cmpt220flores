// Leslie Flores
// January 26, 2017
// Grade Calculator Assignment

import java.util.Scanner;

 public class GradeCalc {
   public static void main(String [] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter the following as a percentage... ");
     System.out.println("Midterm Grade: ");
     int midGrade = input.nextInt();
     System.out.println("Final Exam: ");
     int finGrade = input.nextInt();
     System.out.println("Projects: ");
     int proGrade = input.nextInt();
     System.out.println("Homework and Labs: ");
     int hwpGrade = input.nextInt();
     double finalGrade = (midGrade * 0.20) + (finGrade * 0.20) + (proGrade * 0.20) + (hwpGrade * 0.40);
     System.out.println("Your final grade is: " + finalGrade + "%.");
 }
}