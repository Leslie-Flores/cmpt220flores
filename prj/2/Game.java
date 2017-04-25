// Leslie Flores
// Last Updated: April 25th, 2017
// Life of a Syrian Refugee: The Journey

import java.util.Scanner;

public class Game{
	public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    String playerLoc;
    int playerScore;
    int score = 5;
    String intro = "\n Welcome to Life of a Syrian Refugee: The Journey."
                 + "\n This is version 0.1 of this game so there will be updates.";
    String home = "\n Hasan Ali wakes up to the sound of loud bombing nearby."
                + "\n His wife, Aisha, and their two children are now awake, huddling."
                + "\n He reassures them that they'll be okay when the house shakes."
                + "\n After the shaking stops, the Ali family realizes their home was destroyed."
                + "\n Now, with no home, the family has to leave or risk dying from the dangers.";
    String hometown = "\n After a restless night, Hasan packs their remaining belongings."
                    + "\n Aisha made sure to have their children ready to go and looks at her husband."
                    + "\n Hasan is worried about the troubles they'll encounter and their safety."
                    + "\n After realizing that most of their neighbors are dead, they set off carefully."
                    + "\n Hasan takes one look back at his destroyed hometown before departing.";
    String checkpoint = "\n After a couple hours, the family grows tired of walking so much."
                      + "\n Hasan decides to hold his youngest, little Ahmed, so he can rest."
                      + "\n The child soon points out that there's something up ahead."
                      + "\n Hasan's heart sinks when he realizes that it's a military checkpoint."
                      + "\n Taking another route bypassing the check, the family avoids trouble.";
    String village = "\n Welcome to the Al-Hwash village.";
    String sea = "\n Welcome to the Mediterranean Sea.";
    String boat = "\n On your way to freedom for your family.";
    String land = "\n You made it to Turkey! Congrats! You won!.";
    boolean isAlive = true;
    
    
		System.out.println(intro);
  
    System.out.print(home);
    playerScore = 0;
    playerLoc = "Destroyed Home";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    isAlive = true;

    System.out.print(hometown);
    playerScore += score;
    playerLoc = "Destroyed Hometown";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    isAlive = true;
    
    System.out.print(checkpoint);
    playerScore += score;
    playerLoc = "Checkpoint";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    isAlive = true;
    
    System.out.print(village);
    playerScore += score;
    playerLoc = "Village";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    isAlive = true;
    
    System.out.print(sea);
    playerScore += score;
    playerLoc = "Mediterranean Sea";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    isAlive = true;
    
    System.out.print(boat);
    playerScore += score;
    playerLoc = "Dinghy";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    isAlive = true;
    
    System.out.print(land);
    playerScore += score;
    playerLoc = "Turkey";
    System.out.print("\n Final Score: " + playerScore);
    System.out.println("\n Final Location: " + playerLoc);
    isAlive = true;
	}
}