// File: RandomMonthGen.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Random Month Generators
// Due date: February 9th, 2017
// Version 1.0

  public class RandomMonthGen {
    public static void main (String[] args) {
	  int month = (int)(Math.random() * 13);
	  if (month == 1) {
	    System.out.println("It's January.");
	  }
	  else if (month == 2){
	    System.out.println("It's February.");
	  }
	  else if (month == 3){
	    System.out.println("It's March.");
	  }
	  else if (month == 4){
	    System.out.println("It's April.");
	  }
	  else if (month == 5){
	    System.out.println("It's May.");
	  }
	  else if (month == 6){
	    System.out.println("It's June.");
	  }
	  else if (month == 7){
	    System.out.println("It's July.");
	  }
	  else if (month == 8){
	    System.out.println("It's August.");
	  }
	  else if (month == 9){
	    System.out.println("It's September.");
	  }
	  else if (month == 10){
	    System.out.println("It's October.");
	  }
	  else if (month == 11){
	    System.out.println("It's November.");
	  }
	  else if (month == 12){
	    System.out.println("It's December.");
	  }
    }
 }