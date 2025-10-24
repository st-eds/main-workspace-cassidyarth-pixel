import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-~- HEADS OR TAILS -~-");

        String userInput;
        
        boolean isPlaying = true;
        boolean userHeads = true;
        boolean compHeads = true;

        int userWins = 0;
        int userLosses = 0;
        int rng = 0;

        while (isPlaying) {
            System.out.print("\nGuess the outcome (heads/tails): ");

            userInput = input.nextLine().toLowerCase();

            // User Guess
            if (userInput.equals("heads")) {
                userHeads = true;
            }

            else if (userInput.equals("tails")) {
                userHeads = false;
            }

            else {
                System.out.println("WRONG!!! Exiting...");
                System.exit(0);
            }


            rng = (int)(Math.random() * 2) + 1;
            System.out.println(rng);

            // True Coin Sign
            if (rng == 1) {
                compHeads = true;
            }

            else if (rng == 2) {
                compHeads = false;
            }


            // Reveal Coin Sign
            if (compHeads) {
                System.out.print("It's Heads! ");
            }
            
            else {
                System.out.print("It's Tails! ");
            }

            // Win/lose text & Score update
            if (userHeads != compHeads) {
                System.out.println("You Lose.");
                userWins++;
            }

            else if (userHeads == compHeads) {
                System.out.println("You Win!");
                userLosses++;
            }

            System.out.println("Wins: " + userWins + " | Losses: " + userLosses);
            System.out.print("\nPlay again? (y/n) ");

            userInput = input.nextLine().toLowerCase();

            if (userInput.equals("n") || userInput.equals("no")) {
                isPlaying = false;
                System.out.println("\nTHANK YOU FOR PLAYING!");
            }

        }
    }
}