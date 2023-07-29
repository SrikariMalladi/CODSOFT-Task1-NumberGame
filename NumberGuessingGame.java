import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 1016;
        int maxAttempts = 3;
        int playerScore = 0;
		int attempts = 0;
		boolean guessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain = true;

        while (playAgain) {
            int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("I have generated a random number between 1 and 1016 (inclusive).");


            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    guessedCorrectly = true;
                    playerScore += (maxAttempts - attempts + 1);
                    System.out.println("Congratulations! You guessed the correct number!");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you have used all your attempts. The correct number was: " + secretNumber);
            }

            System.out.println("Your score: " + playerScore);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing Number Guessing game! Goodbye!");
        scanner.close();
    }
}