import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- The Wonderful Journey ---");

        // User Input

        System.out.print("Enter a noun: ");
        String noun1 = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter another noun: ");
        String noun2 = input.nextLine();
        
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        // Story Output

        System.out.print("\n\n");
        System.out.println("Here is your wonderful story: \n");
        System.out.println("Once upon a time, a " + adjective + " " + noun1 + " decided to " + verb + ".");
        System.out.println("On it's journey, it found a mysterious " + noun2 + ".");
        System.out.println("The " + noun1 + " and the " + noun2 + " became good friends.");
        System.out.println("Together, they " + verb + "ed " + adverb + " into the sunset happily ever after.\n");
    }
}