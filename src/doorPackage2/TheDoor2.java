package doorPackage2;

import java.util.Scanner;
/**
 * 
 * Author: Andrew Roney
 * 
 **/

public class TheDoor2 {
	private String knob;
	private String accentColor;
	private String material;
	private int height;
	private boolean hasWindow;
	
//Constructor: setting up the door
	public TheDoor2(String knob, String accentColor, int height, String material, boolean hasWindow) {
		this.knob = knob;
		this.accentColor = accentColor;
		this.height = height;
		this.material = material;
		this.hasWindow = hasWindow;
	}
	
//Method: Gather user input for the door.
	public TheDoor2(Scanner userInput) {
		System.out.println("Follow the instructions to setup the new door:\n---------------");
		
		System.out.println("Enter the door knob type: ");
			setKnob(userInput.nextLine());
			
		System.out.println("Enter the door accent color: ");
			setHingeColor(userInput.nextLine());
		
		System.out.println("Enter the door height in feet (rounded to nearest whole number): ");
			setHeight(userInput.nextInt());
			userInput.nextLine();//Stops skipping the material user input.
			
		System.out.println("Enter the door material: ");
			setMaterial(userInput.nextLine());
		
		System.out.println("Does the door have a window (true/false): ");
			setHasWindow(userInput.nextBoolean());
	}

/*SET METHODS*/
	
//Method: Set the door's knob type.
	private TheDoor2 setKnob(String knob) {
		this.knob = knob;
		return this;
	}
	
//Method: Set the door's hinge color.
	private TheDoor2 setHingeColor(String accentColor) {
		this.accentColor = accentColor;
		return this;
	}

//Method: Set the door's height.
	private TheDoor2 setHeight(int height) {
		this.height = height;
		return this;
	}

//Method: Set the door's material type.
	private TheDoor2 setMaterial(String material) {
		this.material = material;
		return this;
	}

//Method: Set the doors window status.
	private TheDoor2 setHasWindow(Boolean hasWindow) {
		this.hasWindow = hasWindow;
		return this;
	}
	

/*GET METHODS*/
	
	
//Method: Called to retrieve current value of the knob type.
	public String getKnob() {
		return this.knob;
	}
	
//Method: Called to retrieve current value of the height.
	public int getHeight() {
		return this.height;
	}
	
//Method: Called to retrieve the current value of the hinge color.
	public String getHingeColor() {
		return this.accentColor;
	}

//Method: Called to retrieve the current value of the material.
	public String getMaterial() {
		return this.material;
	}
	
//Method: Called to retrieve the window inclusion status.
	public boolean getHasWindow() {
		return this.hasWindow;
	}

	
	
	
//Method: Called to print out statement.
	public String doorSetup() {
		return "\tKnob: "+ getKnob() +"\n\tHinge Color: "+ getHingeColor() +"\n\tHeight: "+ getHeight() +"ft\n"+
				"\tMaterial: "+ getMaterial() +"\n\tWindows Included: "+ getHasWindow();
	}
}
