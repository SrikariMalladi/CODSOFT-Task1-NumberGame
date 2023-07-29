# CODSOFT-Task1-NumberGame

Sure, let's go through the explanation of the provided Java code for the Number Guessing Game:

1. **Import Statements:**
The code begins with import statements to include necessary classes: `java.util.Random` for generating random numbers and `java.util.Scanner` for reading user input.

2. **Variable Declarations:**
The code declares several variables to be used in the game:
   - `scanner`: An instance of the `Scanner` class to read user input.
   - `random`: An instance of the `Random` class to generate random numbers.
   - `minRange` and `maxRange`: Define the range within which the random number will be generated. The range is from `minRange` to `maxRange - 1`. In this case, the range is from 1 to 1016 (inclusive).
   - `maxAttempts`: Defines the maximum number of attempts a player has to guess the correct number. In this code, the player has 3 attempts.
   - `playerScore`: Holds the player's score, which is based on the number of attempts taken to guess the correct number.
   - `attempts`: Tracks the number of attempts made by the player in the current round.
   - `guessedCorrectly`: A boolean flag to indicate whether the player has guessed the correct number.

3. **Welcome Message:**
The game starts with a welcome message, inviting the player to the Number Guessing Game.

4. **Main Game Loop:**
The game is designed to allow the player to play multiple rounds. It uses a `while` loop with the condition `playAgain` to control the flow of the game.

5. **Round Setup:**
For each round, the game generates a new `secretNumber` using the `nextInt()` method of the `Random` class, which selects a random integer within the specified range (`minRange` to `maxRange - 1`).

6. **User Input and Guessing:**
The player is prompted to enter their guess through the `Scanner`. The game will provide feedback after each guess, indicating whether the guess is too high or too low compared to the `secretNumber`. The player has `maxAttempts` (3 in this code) to guess the correct number.

7. **Scoring and End of Round:**
If the player guesses the correct number within the allowed attempts, they receive a score based on the number of attempts remaining. The score is calculated using the formula: `(maxAttempts - attempts + 1)`. For instance, if the player guesses on the first attempt, they will score `(3 - 1 + 1) = 3`. If they guess on the third attempt, they will score `(3 - 3 + 1) = 1`. If the player fails to guess the correct number within the allowed attempts, they are informed about the correct `secretNumber`.

8. **Play Again:**
After each round, the player is asked if they want to play again. If the player responds with "yes," a new round begins with a new random number. If they respond with "no," the game exits the `while` loop, and the final score is displayed.

9. **Closing Message:**
Once the player decides not to play again, the game displays a closing message, thanking the player for playing.

10. **Resource Management:**
The `Scanner` instance is closed at the end to release system resources.

Overall, the code allows the player to play the Number Guessing Game with multiple rounds, tracks their score, and gives them feedback on their guesses. The game continues until the player chooses to stop playing.

** Output: Demo **
