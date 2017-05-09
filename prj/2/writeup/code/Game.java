// File: Game.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Life of a Syrian Refugee: The Journey
// Due date: May 4th, 2017
// Version 1.1

import java.util.Scanner;

public class Game{
	public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    String playerLoc;
    String currLoc;
    String locDesc;
    int playerScore;
    int score = 5;
    String intro = "Welcome to Life of a Syrian Refugee: The Journey. \n"
                 + "This is version 1.1 of this game. \n";
    System.out.println(intro);
    System.out.print("What is your name? ");
    String name = input.nextLine();
    System.out.println();
    boolean isAlive = true;
    
    String home = name + " Rivas wakes up to the sound of loud bombing nearby. \n"
                + "His wife, Nancy, and their two children are now awake, huddling. \n"
                + "He reassures them that they'll be okay when the house shakes. \n"
                + "After the shaking stops, the Rivas family realizes their home was destroyed. \n"
                + "Now, with no home, the family has to leave or risk dying from the dangers. \n";
    String pressEnter = "\n Press Enter to continue. ";
    String hometown = "After a restless night, " + name + " packs their remaining belongings. \n"
                    + "Nancy made sure to have their children ready to go and looks at her husband. \n"
                    + name + " is worried about the troubles they'll encounter and their safety. \n"
                    + "After realizing that most of their neighbors are dead, they set off carefully. \n"
                    + name + " takes one look back at his destroyed hometown before departing. \n";
    String checkpoint = "After a couple hours, the family grows tired of walking so much. \n"
                      + name + " decides to hold his youngest, little Ahmed, so he can rest. \n"
                      + "The child soon points out that there's something up ahead. \n"
                      + name + "'s heart sinks when he realizes that it's a military checkpoint. \n"
                      + "Taking another route bypassing the check, the family avoids trouble. \n";
    String village = "After a few days of heading westward to Turkey, the family is really tired. \n"
                   + "Nancy is a couple months pregnant and is clearly really tired of this walk. \n"
                   + "They soon come across a village, which is clearly Christian, making " + name + " worried. \n"
                   + "However, the family finds that the villagers are welcoming and lets them rest. \n"
                   + "After a goodnight's sleep, the family bids them farewell and sets off again. \n";
    String sea = "Now more than halfway there, the family soon comes across a port city in view. \n"
               + "There are other families there, eager and anxious to leave this place. \n"
               + name + "'s eldest, Daniyah, clings to her father and asks when they will go. \n"
               + "After much bargaining with the smuggler, " + name + " manages to get them on the last boat. \n"
               + "As they leave, he takes one last look at his country that he has known his entire life. \n";
    String boat = "The boat is rather poorly built and clearly has not been maintained in recent years. \n"
                + "However, after much praying, the boat still remains intact despite its shape. \n"
                + "There's a storm nearby and it makes the waters very choppy and everyone seasick. \n"
                + name + "'s family stick together and are not thrown off the boat by the storm. \n"
                + "Soon enough, the storm clears and land is seen in the horizon much to their relief. \n";
    String land = "The land that everyone saw turns out to be Turkey and they are not that far to it. \n"
                + "Everyone celebrates and " + name + " sighs in relief that his family will be safe. \n"
                + "They encounter the Turkish coastal guard who sees them and takes them to shore. \n"
                + name + "'s nervous that they'll send everyone back to Syria as he's seen before. \n"
                + "But that doesn't happen as they take everyone to a refugee camp. \n";
    String youWon = "Congrats! You have made it to Turkey! Good job and thanks for playing! \n";
    String copyright = "Copyright: 2017, Leslie Flores, leslie.flores1@marist.edu";
 
    locDesc = home;
    currLoc = "Destroyed Home";
    
    System.out.print(locDesc);
    playerScore = 0;
    playerLoc = currLoc;
    System.out.println("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter = input.nextLine();
    System.out.println();
    isAlive = true;

    locDesc = hometown;
    currLoc = "Destroyed Hometown";
    
    System.out.print(locDesc);
    playerScore += score;
    playerLoc = currLoc;
    System.out.println("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter2 = input.nextLine();
    System.out.println();
    isAlive = true;
    
    locDesc = checkpoint;
    currLoc = "Military Checkpoint";
    
    System.out.print(locDesc);
    playerScore += score;
    playerLoc = currLoc;
    System.out.println("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter3 = input.nextLine();
    System.out.println();
    isAlive = true;
    
    locDesc = village;
    currLoc = "Christian Village";
    
    System.out.print(locDesc);
    playerScore += score;
    playerLoc = currLoc;
    System.out.println("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter4 = input.nextLine();
    System.out.println();
    isAlive = true;
    
    locDesc = sea;
    currLoc = "Mediterranean Sea";
    
    System.out.print(locDesc);
    playerScore += score;
    playerLoc = currLoc;
    System.out.println("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter5 = input.nextLine();
    System.out.println();
    isAlive = true;
    
    locDesc = boat;
    currLoc = "Dinghy at sea";
    
    System.out.print(locDesc);
    playerScore += score;
    playerLoc = currLoc;
    System.out.println("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter6 = input.nextLine();
    System.out.println();
    isAlive = true;
    
    locDesc = land;
    currLoc = "Turkish shoreline";
    
    System.out.print(locDesc);
    playerScore += score;
    playerLoc = currLoc;
    System.out.println("\n Final Score: " + playerScore);
    System.out.println("\n Final Location: " + playerLoc);
    System.out.println();
    isAlive = true;
    
    System.out.print(youWon);
    System.out.println(copyright);
	}
}