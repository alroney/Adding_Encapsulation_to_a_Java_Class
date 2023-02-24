package doorPackage2;

import java.util.Scanner;

/**
 * 
 * @author Andrew Roney
 *
 */

public class RunTheDoor2 {
	public static void main(String[] args) {
		String answer = "no";
		Scanner userInput = new Scanner(System.in);
		TheDoor2 defaultDoor = new TheDoor2("handle", "silver", 6, "wood", false);
		
		System.out.print("The default door setup: \n\n"+ defaultDoor.doorSetup() +"\n\n");
		
		System.out.println("Would you like to create a new door (y/n): ");
			answer = userInput.nextLine();
			
		if (answer.equals("y")) {
			TheDoor2 door1 = new TheDoor2(userInput);//New instance of TheDoor created by the user based on their input.
			userInput.close();//Stop user control after finished with scanner method.
			System.out.print("\nThe new door setup: \n"+ door1.doorSetup() +"\n\nThanks for playing");//Print out the door setup from the user created instance.
		}
		
		else
			System.out.println("Thanks for playing!");
		
		
		
		
	}
}
