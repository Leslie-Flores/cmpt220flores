// Leslie Flores
// January 25th, 2017
// Exercise 2.5

import java.util.Scanner;

 public class FinanceTip {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the subtotal and a gratuity rate: ");
     double subtotal = input.nextDouble();
     double tip = input.nextDouble();
     double gratuity = (tip/100) * subtotal;
     double totalmoney = gratuity + subtotal;
     System.out.print("The gratuity is $" + gratuity + " and total is $" + totalmoney);  
 }
}