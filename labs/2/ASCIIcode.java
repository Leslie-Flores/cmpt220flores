// Leslie Flores
// February 21st, 2017
// Finding the character of an ASCII code

import java.util.Scanner;

public class ASCIIcode{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		int numbToCon = input.nextInt();
		char ascii = (char) numbToCon;
		
		System.out.println("The character for ASCII code " + numbToCon + " is " + ascii + ".");
	}
}