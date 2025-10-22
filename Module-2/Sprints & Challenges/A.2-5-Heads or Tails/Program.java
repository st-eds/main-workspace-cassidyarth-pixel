import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-~- HEADS OR TAILS -~-\n");

        boolean isPlaying = true
        boolean userHeads = true
        boolean compHeads = true

        while (isPlaying) {
            System.out.print("Guess the outcome (heads/tails): ");

            // User Guess
            if ((input.nextLine().toLowerCase()).equals("heads")) {
                userHeads = true
            }

            else if ((input.nextLine().toLowerCase()).equals("tails")) {
                userHeads = false
            }

            else {
                System.out.println("WRONG!!! Exiting...");
                System.exit(0);
            }

            // True Outcome
            if ((int)Math.random() == 0) {
                compHeads = true
            }

            else {
                compHeads = false
            }
        }
    }
}