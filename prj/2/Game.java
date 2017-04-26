// Leslie Flores
// Last Updated: April 25th, 2017
// Life of a Syrian Refugee: The Journey

import java.util.Scanner;

public class Game{
  private static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    String playerLoc;
    int playerScore;
    int score = 5;
    String intro = "Welcome to Life of a Syrian Refugee: The Journey. \n"
                 + "This is version 0.2 of this game so there will be updates. \n";
                 
    System.out.println(intro);
    System.out.print("What is your name? ");
    String name = scanner.nextLine();
    System.out.println();
    boolean isAlive = true;
    
    String home = name + " Ali wakes up to the sound of loud bombing nearby. \n"
                + "His wife, Aisha, and their two children are now awake, huddling. \n"
                + "He reassures them that they'll be okay when the house shakes. \n"
                + "After the shaking stops, the Ali family realizes their home was destroyed. \n"
                + "Now, with no home, the family has to leave or risk dying from the dangers. \n";
    String pressEnter = "\n Please press Enter to continue. ";
    String hometown = "After a restless night, " + name + " packs their remaining belongings. \n"
                    + "Aisha made sure to have their children ready to go and looks at her husband. \n"
                    + name + " is worried about the troubles they'll encounter and their safety. \n"
                    + "After realizing that most of their neighbors are dead, they set off carefully. \n"
                    + name + " takes one look back at his destroyed hometown before departing. \n";
    String checkpoint = "After a couple hours, the family grows tired of walking so much. \n"
                      + name + " decides to hold his youngest, little Ahmed, so he can rest. \n"
                      + "The child soon points out that there's something up ahead. \n"
                      + name + "'s heart sinks when he realizes that it's a military checkpoint. \n"
                      + "Taking another route bypassing the check, the family avoids trouble. \n";
    String village = "After a few days of heading westward to Turkey, the family is really tired. \n"
                   + "Aisha is a couple months pregnant and is clearly really tired of this walk. \n"
                   + "They soon come across a village, which is clearly Christian, making Hasan worried. \n"
                   + "However, the family finds that the villagers are welcoming and lets them rest. \n"
                   + "After a goodnight's sleep, the family bids them farewell and sets off again. \n";
    String sea = "Now more than halfway there, the family soon comes across a port city in view. \n"
               + "There are other families there, eager and anxious to leave this place. \n"
               + name + "'s eldest, Daniyah, clings to her father and asks when they will go. \n"
               + "After much bargaining with the smuggler, " + name + " manages to get them on the last boat. \n"
               + "As they leave, he takes one last look at his country that he has known his entire life. \n";
    String boat = "The boat is rather poorly built and clearly has not been maintained in recent years. \n"
                + "However, after much praying, the boat still remains intact despite it's shape. \n"
                + "There's a storm nearby and it makes the waters very choppy and everyone seasick. \n"
                + name + "'s family stick together and are not thrown off the boat by the storm. \n"
                + "Soon enough, the storm clears and land is seen in the horizon much to their relief. \n";
    String land = "The land that everyone saw turns out to be Turkey and they are not that far to it. \n"
                + "Everyone celebrates and " + name + " sighs in relief that his family will be safe. \n"
                + "They encounter the Turkish coastal guard who sees them and takes them to shore. \n"
                + name + "'s nervous that they'll send everyone back to Turkey as he's seen before. \n"
                + "But that doesn't happen as they take everyone to a refugee camp. \n";
    String youWon = "Congrats! You have made it to Turkey! Good job and thanks for playing! \n";
    String copyright = "Copyright: 2017, Leslie Flores, leslie.flores1@marist.edu";
  
    System.out.print(home);
    playerScore = 0;
    playerLoc = "Destroyed Home";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter = scanner.nextLine();
    System.out.println();
    isAlive = true;

    System.out.print(hometown);
    playerScore += score;
    playerLoc = "Destroyed Hometown";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter2 = scanner.nextLine();
    System.out.println();
    isAlive = true;
    
    System.out.print(checkpoint);
    playerScore += score;
    playerLoc = "Checkpoint";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter3 = scanner.nextLine();
    System.out.println();
    isAlive = true;
    
    System.out.print(village);
    playerScore += score;
    playerLoc = "Village";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter4 = scanner.nextLine();
    System.out.println();
    isAlive = true;
    
    System.out.print(sea);
    playerScore += score;
    playerLoc = "Mediterranean Sea";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter5 = scanner.nextLine();
    System.out.println();
    isAlive = true;
    
    System.out.print(boat);
    playerScore += score;
    playerLoc = "Dinghy";
    System.out.print("\n Score: " + playerScore);
    System.out.println("\n Location: " + playerLoc);
    System.out.print(pressEnter);
    String enter6 = scanner.nextLine();
    System.out.println();
    isAlive = true;
    
    System.out.print(land);
    playerScore += score;
    playerLoc = "Turkey";
    System.out.print("\n Final Score: " + playerScore);
    System.out.println("\n Final Location: " + playerLoc);
    System.out.println();
    System.out.print(youWon);
    isAlive = true;
    
    System.out.println(copyright);
	}
}