import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Demo 1 - Counting Multiples ---");

        System.out.print("Choose a number: ");
        int number = input.nextInt();
        System.out.print("List how many multiples of " + number + "? ");
        int count = input.nextInt();

        input.nextLine();

        int sum = number;

        for (int i = 0; i < count; i++)
        {
            System.out.print(sum + " ");
            sum += number;
        }
        
        System.out.print("\nPress enter to continue...");
        input.nextLine();


        //


        System.out.println("\n--- Demo 2 - Square Tables ---");

        System.out.print("Enter row count: ");
        int rows = input.nextInt();

        System.out.println("\nNumber\tSquare");
        System.out.println("----------------");

        for (int i = 1; i <= rows; i++)
        {
            System.out.println(i + "\t" + (i * i));
        }
    }
}