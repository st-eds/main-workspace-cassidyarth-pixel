import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many apples are you buying? ");
        int apples = input.nextInt();
        input.nextLine();

        System.out.print("How many bananas are you buying? ");
        int bananas= input.nextInt();
        input.nextLine();

        System.out.print("How many oranges are you buying? ");
        int oranges = input.nextInt();
        input.nextLine();

        System.out.println();

        System.out.println("Grocery List:");
        System.out.println("Apples: " + apples);
        System.out.println("Bananas: " + bananas);
        System.out.println("Oranges: " + oranges);

        System.out.println();

        System.out.println("Total fruit: " + (apples + bananas + oranges));

    }
}