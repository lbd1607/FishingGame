import java.util.Scanner;

/**
 * Laura Davis CIS 260 903
 * This program simulates a fishing game that rolls a die and awards
 * the player points based on the random number they get. Each number on
 * the die represents a different item of different value. The fisher re-rolls
 * as many times as they desire. 
 */

public class FishingGame 
{
	public static void main(String[] args)
	{
		String input;
		String again = "y";
		int total = 0;
		
		Die die1 = new Die(SIDES);
		
		Scanner keyboard = new Scanner(System.in);
		
		while (again.equalsIgnoreCase("y"))
		{
			die1.roll();
			
			System.out.println(die1.getValue());		
			System.out.println("Would you like to cast again? ");
			again = keyboard.nextLine();	
		}
		
	}//end of main

}//end of class
