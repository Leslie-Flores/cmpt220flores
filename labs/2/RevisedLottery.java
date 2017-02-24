// File: RevisedLottery.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Revised Lottery
// Due date: February 9th, 2017
// Version 2.0

import java.util.Scanner;

public class RevisedLottery{
  public static void main (String[] args){
	  int lottery = (int)(Math.random() * 1000);
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter your lottery number picks here (three digits): ");
	  int guess = input.nextInt();
	  
	  int lotteryDigit1 = lottery / 100;
	  int lotteryDigit2 = lottery / 10;
	  int lotteryDigit3 = lottery % 10;
	  
	  int guessDigit1 = guess / 100;
	  int guessDigit2 = guess / 10;
	  int guessDigit3 = guess % 10;
	  
	  System.out.println("The lottery number is " + lottery + ".");
	  
	  int matchNum;
	  if (guess == lottery)
		  matchNum = 4;
	  else if (guessDigit3 == lotteryDigit1 
	           && guessDigit2 == lotteryDigit3 
			   && guessDigit1 == lotteryDigit2)
		  matchNum = 3;
	  else if (guessDigit3 == lotteryDigit1
	           || guessDigit3 == lotteryDigit2
			   || guessDigit3 == lotteryDigit3
	           || guessDigit2 == lotteryDigit1
               || guessDigit2 == lotteryDigit2
               || guessDigit2 == lotteryDigit3	   
			   || guessDigit1 == lotteryDigit1
			   || guessDigit1 == lotteryDigit2
			   || guessDigit1 == lotteryDigit3)
		  matchNum = 1;
	  else
		  matchNum = 0;
	  
	  switch (matchNum){
		  case 4: System.out.println("Exact match! YOU WON $10,000!"); break;
		  case 3: System.out.println("Match all digits! YOU WON $3,000!"); break;
		  case 1: System.out.println("Match one digit! YOU WON $1,000!"); break;
		  case 0: System.out.println("Sorry, no match.");
	  }
  }
}