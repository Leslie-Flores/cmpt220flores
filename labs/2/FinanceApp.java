// Leslie Flores
// February 21st, 2017
// Financial Application: Monetary units

import java.util.Scanner;

public class FinanceApp{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a money amount in dollars: ");
		String amount = input.nextLine();
		String oneDollars = amount.substring(0, amount.indexOf('.'));

		int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
		int quarters = cents / 25;
		cents %= 25;
		int dimes = cents / 10;
		cents %= 10;
		int nickels = cents / 5;
		cents %= 5;

		System.out.println("Your amount " + amount + " consists of\n " 
			+ numberOfOneDollars + " dollars\n " 
			+ numberOfQuarters + " quarters\n "
			+ numberOfDimes + " dimes\n "
			+ numberOfNickels + " nickels\n "
			+ cents + " pennies\n "
			);
	}
}