import java.util.Random; 
import java.util.Scanner; 
 class NumberGuessing 
 {
   NumberGuessing()
        {
        Scanner scanner = new Scanner(System.in); 
        Random rand = new Random(); // Create a Random object to generate random numbers
        boolean playagain = true; // This will control whether the user wants to play again
        
        while (playagain) { // Loop to keep the game running until the user decides to stop
            int min = 1,max = 100; 
            int random_num = rand.nextInt(max - min + 1) + min; // Generate a random number between 1 and 100
            int attempts = 0; 
            int max_attempts = 10; 
            boolean correctguess = false; 
            System.out.println("I have generated a random number between " + min + " and " + max + ". Can you guess it?");
            System.out.println("You have " + max_attempts + " attempts.");

            while (attempts < max_attempts && !correctguess) 
            { 
                System.out.print("Enter your guess: ");
                int userguess = scanner.nextInt(); 
                attempts++; 
                if (userguess < random_num) 
                { 
                    System.out.println("Too low! Try again.");
                }
                  else if (userguess > random_num)  
                { 
                    System.out.println("Too high! Try again.");
                } 
                else  
                {         
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    correctguess = true; // Set correctGuess to true to end the loop
                }
            }
            if (!correctguess)
             { // If the user didn't guess correctly within the allowed attempts
                System.out.println("Sorry! You've used all your attempts. The correct number was " + random_num + ".");
            }

            System.out.print("Do you want to play again? (true/false): ");
            boolean userresponse = scanner.nextBoolean(); 
            playagain = userresponse;   
        }
                    System.out.println("Thank you for playing! Goodbye."); 
    }
}
public class Task_1 
{
    public static void main(String[] args)
 {
NumberGuessing obj=new NumberGuessing();
}
}