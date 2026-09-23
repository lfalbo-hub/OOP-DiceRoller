package diceRollerPd;

import diceRollerPd.Die;

public class DiceBag {
	
	int diceCount = 0; // Integer variable to hold the number of dice in the bag
	int faceCount = 0; // Integer variable to hold the number of face on each die in the bag
	int diceRollSum = 0;  // Integer variable to hold the total of the die faces rolled
	
	// Default Constructor
	public DiceBag() {
		diceCount = 6; // Instantiating diceCount with 6, representing 6 dice in the bag
		faceCount = 6; // Instantiating faceCount with 6, representing 6 face on each die in the bag
	}
	
	//Constructor with 2 Integer parameters
	public DiceBag(int diceCount, int faceCount) {
		this.diceCount = diceCount; // User input diceCount getting put into diceCount
		this.faceCount = faceCount; // User input faceCount getting put into faceCount
	}
	
	public int roll() {
		Die[] dice = new Die[diceCount]; // Instantiated array of Die objects with length of diceCount
		
		// Loop to instantiate each Die in dice array with the number of faces
		for(int a = 0; a < dice.length; a++) {
			dice[a] = new Die(faceCount);
		}
		
		// Loop to roll each die in dice array add adding their face to diceRoll Sum and outputting a formatted message
		for(int b = 0; b < dice.length; b++) {
			diceRollSum += dice[b].roll();
			System.out.println("Roll #" + (b + 1) + " : " + dice[b].getCurrentFace());
		}
		
		return diceRollSum;
	}
	
	public String toString() {
		
		return "Total Sum of Dice Rolled Is : " + diceRollSum; // Formatted return message to be outputted
	}
}
