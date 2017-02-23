// Leslie Flores
// February 21st, 2017
// Phone key pads

import java.util.Scanner;

public class PhoneKeyPad{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String key = input.nextLine();
		char pad = key.charAt(0);
		pad = Character.toUpperCase(pad);

		int number = 0;
		if (Character.isLetter(pad)) {
			if (pad >= 'W')
				number = 9;
			else if (pad >= 'T')
				number = 8;
			else if (pad >= 'P')
				number = 7;
			else if (pad >= 'M')
				number = 6;
			else if (pad >= 'J')
				number = 5;
			else if (pad >= 'G')
				number = 4;
			else if (pad >= 'D')
				number = 3;
			else if (pad >= 'A')
				number = 2;
			System.out.println("The corresponding number is " + number);
		}
		else
			System.out.println(pad + " is an invalid input");
	}
}
