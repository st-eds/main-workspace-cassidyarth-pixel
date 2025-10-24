import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        int coinFlips;
        int rng;
        double heads = 0;
        double tails = 0;
        int ratio;
        double headsPercent;
        double tailsPercent;
        //----------

        System.out.print("Enter the number of times to flip the coin: ");
        coinFlips = input.nextInt();

        for (int i = 1; i <= coinFlips; i++) {
            rng = (int)(Math.random() * 2) + 1;
            
            if (rng == 1) {
                System.out.println("Flip " + i + ":\tHeads");
                heads++;
            }

            else {
                System.out.println("Flip " + i + ":\tTails");
                tails++;
            }
        }

        // Math

        System.out.println("Results: ");
        System.out.println("Heads: " + ((heads / (heads + tails)) * 100) + "% \nTails: " + ((tails / (heads + tails)) * 100) + "%");
        
    }
}