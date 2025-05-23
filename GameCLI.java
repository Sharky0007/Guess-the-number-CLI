public class GameCLI{

    public static void main(String[] args){

// RULES FOR PLAY THE GAME:
      System.out.println();
      System.out.println("Welcome to the Number Guessing Game!");
      System.out.println("I'm thinking of a number between 1 and 100.");
      System.out.println();
      System.out.println("Please select the difficulty level:");
      System.out.println("1. Easy (10 chances)");
      System.out.println("2. Medium (5 chances)");
      System.out.println("3. Hard (3 chances)");
      System.out.println();

// CHOOSE THE DIFFICULTY LEVEL:
     Game game = new Game();
     game.choice();
     System.out.println("You have " + game.numOfChances() + " chances to guess the correct number.");
     System.out.println("Let's start the game!");
     System.out.println();

// GUESS THE NUMBER:
      game.guessGame();

// QUIT THE GAME ONLY WITH USER PERMISSION: 
      game.replayGame();
    }
}