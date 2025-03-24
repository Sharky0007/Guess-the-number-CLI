# Guess-the-number-CLI
This is a number guessing game where user have to guess the number that system already generated.

# About this game
1. User can choose the difficulty as `Easy`, `Medium` and `Hard`.
2. Then user have to guess the number, if number is incorrect then the system print a message with a hint.
3. If user guess the number correctly then the game is over.
4. After guess the correct number user can decide if he/she wants to play again or not.

# How to play the game:
Clone the project: 
```bash
git clone https://github.com/Sharky0007/Guess-the-number-CLI.git
```
Compile the java code:
```bash
javac *.java
```
Run this command to start the game:
```bash
java GameCLI.java
```

# Output of the game:
```bash
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
You have 5 chances to guess the correct number.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 2

Great! You have selected the Medium difficulty level.
Let's start the game!

Enter your guess: 50
Incorrect! The number is less than 50.

Enter your guess: 25
Incorrect! The number is greater than 25.

Enter your guess: 35
Incorrect! The number is less than 35.

Enter your guess: 30
Congratulations! You guessed the correct number in 4 attempts.
```

# TODO
- [ ] Correct the replay and quit logic.
- [ ] Implement the timer to check how much time user take to guess the number.
- [ ] Display proper messages for GAME OVER.
- [ ] Keep tracking of user high score.
- [x] If the user chances over then we need to display message `Your chance is over, Do you want to play again?`
- [x] After user press 0 the game is still running for one more time, that we need to fix.
