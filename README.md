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
Compile the files:
```bash
javac *.java
```
Run the command:
```bash
java GameCLI.java
```

# TODO
1. Correct the replay and quit logic.
2. Implement the timer to check how much time user take to guess the number.
3. Display proper messages for GAME OVER.
4. Keep tracking of user high score.
5. If the user chances over then we need to display message `Your chance is over, Do you want to play again?`
6. After user press 0 the game is still running for one more time, that we need to fix.
