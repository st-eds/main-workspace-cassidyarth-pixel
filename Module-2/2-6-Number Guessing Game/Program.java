import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = (int)(Math.random() * 10) + 1;
        int guess = 0;
        int tries = 0;

        while (guess != secretNumber) {
            System.out.print("Guess the number (1-10): ");
            guess = input.nextInt();
            tries++;

            if (guess == secretNumber) {
                System.out.println("Correct!");
            }
            
            else if (guess < 1 || guess > 10) {
                System.out.println("Your guess was out of range.");
            }

            else if (guess > secretNumber) {
                System.out.println("WRONG! Your guess was too big!");
            }

            else if (guess < secretNumber) {
                System.out.println("WRONG! Your guess was too small!");
            }
        }
    }
}

// It allowed the game to repeat all the code within it, allowing the player to play more than once
// If the guess was incorrect, it would give a specific reason why to the user, allowing them to make a closer guess instead of another random one.