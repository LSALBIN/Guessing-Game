//Lukas Albin

//August 23, 2017

//Guessing Game Program

import java.util.Scanner; // Imported the Scanner

public class Guessing_Game {

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); // Make Scanner read the value
		
		System.out.println("Please enter a number above 1!");
		
		int b = cin.nextInt();
		
		System.out.println("I am thinking of a number between 1 and your chosen number. Can you guess it?");
	
		int random = (int)(1 + b*Math.random()); // Chooses random number 1-100
	
		boolean win = false; // Win is false
		
		while(!win) // Starts loop for not win
			{
				int input = cin.nextInt(); 
			
				if(input > random)
			{		
					System.out.println("Too high!");
			}
				else if(input < random)
			{
					System.out.println("Too low!");
			}
				else if(input == random)
			{	
					System.out.println("You win!");
					win = true;	// When win is true the program stops
		
				cin.close(); // Closes loop
			}
	
	
		}
	}
}
