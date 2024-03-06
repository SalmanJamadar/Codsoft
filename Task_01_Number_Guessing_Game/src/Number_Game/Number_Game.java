package Number_Game;

import java.util.Random;
import java.util.Scanner;

public class Number_Game 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	    Random random = new Random();
	        
	    System.out.println("Welcome to Guess the Number game!");
	        
	    int minRange = 1;
	    int maxRange = 100;
	    int maxAttempts = 5;
	    int score = 0;
	        
	    boolean playAgain = true;
	    while (playAgain) 
	    {
	    	int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	        int attempts = 0;
	        boolean guessedCorrect = false;
	            
	        System.out.println("\nI have selected a number between " + minRange + " to " + maxRange + ". Can you guess it ?");
	            
	        while (attempts < maxAttempts && !guessedCorrect) 
	        {
	        	System.out.print("Enter your guess (Attempt " + (attempts + 1) + "/" + maxAttempts + "): ");
	            int guess = scanner.nextInt();
	                
	            if (guess == randomNumber) 
	            {
	            	System.out.println("Congratulations! You guessed the right number !"); 
	            	guessedCorrect = true;
	                score = score + (maxAttempts - attempts);
	            } 
	            else if (guess < randomNumber) 
	            {
	                System.out.println("Too low! Try again.");
	            } 
	            else 
	            {
	                System.out.println("Too high! Try again.");
	            }
	                
	            attempts++;
	        }
	            
	        if (!guessedCorrect) 
	        {
	            System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
	        }
	          
	        System.out.println("Your current score: " + score);
	            
	        System.out.println("Do you want to play again? (yes/no): ");
	        String playAgainInput = scanner.next();
	        playAgain = playAgainInput.equalsIgnoreCase("yes");
	    }
	        
	    System.out.println("Thank you for playing Guess the Number!");
	}
}

