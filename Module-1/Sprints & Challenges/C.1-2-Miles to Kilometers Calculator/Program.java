import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Miles to Kilometers Calculator ---");

        System.out.print("Enter the distance in miles: ");
        double miles = input.nextDouble();
        input.nextLine();

        double kilometers = miles * 1.609;

        System.out.print(miles + " miles is equal to " + kilometers + " kilometers.");

    }
}