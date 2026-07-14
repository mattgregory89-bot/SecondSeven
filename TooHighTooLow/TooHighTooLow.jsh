// a simple high low number guessing game for JShell
//
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class TooHighTooLow {
    private int number = 0;
    private int guesses = 0;
    private ArrayList<Integer> previousGuesses = new ArrayList<>();

    public TooHighTooLow() {
        // setup number to be a random number from 1 to 100
        // TODO: Create a Random object
        // TODO: Set this.number to a random integer from 1 to 100 (hint: use nextInt)
        // TODO: Set this.guesses to 0
        Random random = new Random();
        // this.number = random.nextInt(100) + 1; // Generates a number between 1 and 100
         this.number = 42; // For testing purposes, you can uncomment this line to set a fixed number
        this.guesses = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // TODO: Get a number guess from the user (between 1 and 100)
            // TODO: Print a prompt asking for a guess
            // TODO: Read an integer from the scanner and store it in a variable called guess
            System.out.println("=================================");
            System.out.println("Guess a number between 1 and 100! ");
            System.out.println("=================================");
            System.out.println("You have made " + this.guesses + " guesses so far.");
            System.out.println("=================================");
            System.out.print("Previous guesses: ");
                for (int g : this.previousGuesses) {
                    System.out.print(g + " ");
                }
            System.out.println();
            System.out.println("=================================");
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            previousGuesses.add(guess);
        
        

            // TODO: Increment the number of guesses by 1   
            this.guesses = this.guesses + 1;
            

            // TODO: Check if the guess equals the secret number
            // TODO: If correct, print a congratulations message with the number of guesses
            // TODO: Exit the loop using break
            if (guess == this.number) {
                System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`");
                System.out.println("Congratulations! You guessed the number in " + this.guesses + " guesses.");
                System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`");
                break;
            }
            // TODO: Check if the guess is less than the secret number
            // TODO: If so, print "Too low!"
            if (guess < this.number) {
                System.out.println(" 💀💀💀 LOW BLOW 💀💀💀");
                System.out.println("~~~~ Oof! Low Blow!~~~~");
                System.out.println("~~~~~~ Too low!~~~~~~~~");
                System.out.println("~~~ Keep Guessing!~~~~~");
            }
            if (guess > this.number) {
                System.out.println("👾👽👾👽 TOO HIGH 👽👾👽👾");
                System.out.println("~~Butterfly in the sky!~~");
                System.out.println("~~~~~~~ Too high! ~~~~~~~");
                System.out.println("~~~~~ Keep Guessing!~~~~~");
            }
            
            // TODO: Check if the guess is greater than the secret number
            // TODO: If so, print "Too high!"

            // TODO: Check if the player has made 10 or more guesses
            // TODO: If so, print a message saying they've run out of guesses and reveal the number
            // TODO: Exit the loop using break
            if (this.guesses == 15) {
                System.out.println("☠️☠️☠️☠️☠️ GAME OVER ☠️☠️☠️☠️☠️");
                System.out.println("☠️☠️ NO MORE GUESSES ☠️☠️");
                System.out.println("☠️ The number was: " + this.number + " ☠️");
                break;
            }
        }
    }

    public static void main(String[] args) {
        TooHighTooLow game = new TooHighTooLow();
        game.play();
        System.out.println("🎉🎊🎉🎊🎉🎊🎉🎊Thanks for playing.🎉🎊🎉🎊🎉🎊🎉🎊🎉");
    }
}

// Run the game
TooHighTooLow.main(null);
/exit