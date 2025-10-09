import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your head size in inches: ");
        int hatSize = input.nextInt();

        if (hatSize <= 21) {
            System.out.println("Hat size: Small");
            System.out.println("Snug fit for speedy thinkers");
        }

        else if (hatSize > 21 && hatSize <= 22.5) {
            System.out.println("Hat size: Medium");
            System.out.println("Balanced and brilliant.");
        }

        else if (hatSize > 22.5 && hatSize <= 24) {
            System.out.println("Hat size: Large");
            System.out.println("Roomy for big ideas.");
        }

        else if (hatSize > 24 && hatSize <= 30) {
            System.out.println("Hat size: Extra Large");
            System.out.println("Legendary noggin detected.");
        }

        else {
            System.out.println("Dishonest hat haver spotted.");
        }
        
    }
}