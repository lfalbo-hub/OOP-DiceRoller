package diceRollerUi;

import java.util.Scanner;

import diceRollerPd.DiceBag;
import diceRollerTest.DiceBagTest;
import diceRollerTest.DieTest;

public class DiceRollerStart {
	

	
	public static void main(String[] args) {

		//doConsoleUi();
		doSwingUi();
		
	}
	
	private static void doConsoleUi() {
		
		System.out.println("DICE ROLLER PROJECT");
		System.out.println("---DICE BAG TEST---");
		
		Scanner numberOfDiceInput = new Scanner(System.in); // Scanner for user input
		System.out.print("Please Enter Number of Dice in Bag : ");  // Prompt to ask for user input of Dice count
		int numberOfDice = numberOfDiceInput.nextInt(); // Variable that stores the user input of Dice
		
		Scanner numberOfFacesInput = new Scanner(System.in); // Scanner for user input
		System.out.print("Please Enter Number of Faces on each die : "); // Prompt to ask for user input of Faces
		int numberOfFaces = numberOfFacesInput.nextInt(); // Variable that stores the user input of Faces
		
		//Test
		//System.out.println("Number of Dice: " + numberOfDice);
		//System.out.println("Number of Faces: " + numberOfFaces);
		
		System.out.println("Test 1 \n\n");
		
		DiceBag testBag = new DiceBag(numberOfDice, numberOfFaces);  // DiceBag object that gets instantiated with the users inputs
		
		testBag.roll(); // Function call to roll the entire dice bag
		System.out.println(testBag.toString());	// Formatted output from DiceBag class
		
	}
	
	private static void doSwingUi() {
		
		DiceRollerFrame.open();
		
	}
	
}
