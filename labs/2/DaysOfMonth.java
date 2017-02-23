// Leslie Flores
// February 7th, 2017
// Find the numbers of the days in a month

import java.util.Scanner;

public class DaysOfMonth{
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the month number here: ");
	  int numMonth = input.nextInt();
	  System.out.print("Enter the year here: ");
	  int year = input.nextInt();
	  
	  switch (numMonth){
		case 1: System.out.println("January " + year + " has 31 days."); break;
		case 2: System.out.println("February " + year + " has 28 days (unless it's a leap year, then 29 days)."); break;
		case 3: System.out.println("March " + year + " has 31 days."); break;
	    case 4: System.out.println("April " + year + " has 30 days."); break;
		case 5: System.out.println("May " + year + " has 31 days."); break;
		case 6: System.out.println("June " + year + " has 30 days."); break;
		case 7: System.out.println("July " + year + " has 31 days."); break;
		case 8: System.out.println("August " + year + " has 31 days."); break;
		case 9: System.out.println("September " + year + " has 30 days."); break;
		case 10: System.out.println("October " + year + " has 31 days."); break;
		case 11: System.out.println("November " + year + " has 30 days."); break;
		case 12: System.out.println("December " + year + " has 31 days."); break;
		default: System.out.println("Not a month number.");
	  }
  }
}