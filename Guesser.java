/* Write a method named makeGuesses that will guess numbers between 1 and 50 
 * inclusive until it makes a guess of at least 48. It should report each 
 * guess and at the end should report the total number of guesses made.
 */

import java.util.Random;

public class Guesser {
	
	public static void makeGuesses()
	{
		Random rand = new Random();
		int count = 0;
		int nextGuess = rand.nextInt(50);
		
		while(nextGuess < 48)
		{
			count += 1;
			System.out.println("Guess number " + count + ": " + nextGuess);
			nextGuess = rand.nextInt(50);
		}
		
		count += 1;
		System.out.println("Guess number " + count + ": " + nextGuess);
		System.out.println("Completed in " + count + " guesses.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeGuesses();
		makeGuesses();
		
	}

}
