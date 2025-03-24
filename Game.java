import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    Scanner sc = new Scanner(System.in);
    int choice ;

//RETURN MESSAGE BASED ON THE CHOICE:
    public void choice(){
        String msg = "";
        System.out.print("Enter your choice between 1-3: ");
        choice = sc.nextInt();
        System.out.println();
        if(choice == 1){
            msg = "Great! You have selected the Easy difficulty level.";
        }
        if(choice == 2){
            msg = "Great! You have selected the Medium difficulty level.";
        }
        if(choice == 3){
            msg = "Great! You have selected the Hard difficulty level.";
        }
        System.out.println(msg);
    }

// GUESS THE NUMBER AND RETURN CORRECT OR INCORRECT MESSAGE BASED ON THE INPUT:
      public void guessGame(){

        // GENERATE A RANDOM NUMBER:
      int randomNum = ThreadLocalRandom.current().nextInt(1, 100);

        int count = 1;
        int chance = numOfChances();
        for(int i=0; i<chance; i++){
          System.out.print("Guess the number: ");
          int input = sc.nextInt();
         if(input > randomNum){
            System.out.println("Incorrect! The number is less than " + input + ".");
           }
         if(input < randomNum){
            System.out.println("Incorrect! The number is greater than " + input + ".");
           }
         if(input == randomNum){
            System.out.println("Congratulations! You guessed the correct number in " + count + " attempts." );
            break;
           }
         if(count == chance){
            System.out.println("Your chances are over");
         }
          count++;
        }
      }

//RETURN THE NUMBER OF CHANCES BASED ON CHOICE:
      public int numOfChances(){
        int count = 0;
        if(choice == 1){
            count = 10;
        }
        else if(choice == 2){
            count = 5;
        }
        else if(choice == 3){
             count = 3;
        }

        return count;
      }

// PLAY THE GAME AGAIN:
    public void replayGame(){
        int replay = -1;
        while(replay!=0){
            System.out.print("Do you want to play again?(Press any number to continue or 0 to quit): ");
            replay = sc.nextInt();  
            System.out.println();
            if(replay==0){
                System.out.println("You Quit the Game.");
                break;
            }
            choice();
            guessGame();
        }
    }
}
