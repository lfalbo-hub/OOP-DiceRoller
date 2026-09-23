package diceRollerPd;

import java.util.Random;

public class Die {
	
	int faceCount = 0; // Holds the number of faces a die will have
	int currentFace = 0; // Holds the current face that the die is showing
	Random randomGenerator; // random number generator from Random class
	int[] freqCount; // An int array to hold frequency of each face rolled
	
	public Die() {
		faceCount = 6; // Default value is a D6
	}
	
	// Constructor with faceCount parameter
	public Die(int faceCount) {
		this.faceCount = faceCount;
		freqCount = new int[faceCount]; // Instantiate an int array to hold frequency of each face rolled
	}
	
	public int getCurrentFace() {
		return currentFace; // Getter for currentFace variable
	}

	public int roll() {

		randomGenerator = new Random(); // Instantiates a new Random object

		//funcional
		currentFace = randomGenerator.nextInt(faceCount) + 1; // Generates a random number between 1 and the number of Faces
		
		freqCount[currentFace - 1] += 1; // Counts each time a face is rolled and stores it in an array
		
		return currentFace; // returns the face that was rolled
	}
	
	public String toString() {
		
		String output; // String variable to hold the formatted output 
		
		output = "\nFrequency of Each Number\n"; 
		
		// Loop to add each frequency count to output variable formatted in a proper way
		for(int b = 0; b < faceCount; b++) {
			output += (b + 1) + ": " + freqCount[b] + "%\n";
		}
		
		return output;
	}
}
