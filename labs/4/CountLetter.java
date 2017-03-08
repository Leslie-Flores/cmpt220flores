// File: CountLetter.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Count the letters in a string (Exercise 6.20)
// Due date: March 9th, 2017
// Version 1.0

import java.util.Scanner;

public class CountLetter{
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string here: ");
		String string = input.nextLine();
		System.out.println("The number of letters in \"" + 
			string + "\" is " + countLetters(string) + ".");
	}

	public static int countLetters(String s) {
		int numLetters = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				numLetters++;
		}
		return numLetters;
	}
}