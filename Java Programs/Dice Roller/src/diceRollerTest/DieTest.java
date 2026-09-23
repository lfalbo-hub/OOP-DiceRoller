package diceRollerTest;

import diceRollerPd.Die;
import java.util.Scanner;

public class DieTest {
	public static void main(String args[]) {
	
		System.out.println("DICE ROLLER PROJECT-");
		System.out.println("----- DIE TEST -----");
		
		Scanner numberOfFacesInput = new Scanner(System.in); // Scanner for user input
		
		System.out.print("Please Enter Number of Faces on each die : "); // Prompt to ask for user input of Faces
		int numberOfFaces = numberOfFacesInput.nextInt(); // Variable that stores the user input of Faces
		
		Die testDie = new Die(numberOfFaces); // Die object that gets instantiated with the users input
		
		// Loop that rolls the die 100 times and displays a formatted message
		for(int a = 0; a < 100; a++) {
			testDie.roll();
			System.out.println("Roll #" + (a + 1) + ": " + testDie.getCurrentFace());
		}
		
		System.out.println(testDie.toString()); // Formatted output from Die class

	}
}
