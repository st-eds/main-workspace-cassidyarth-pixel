import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Tip Calculator ---");

        System.out.print("Enter the bill subtotal: $");
        double subtotal = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the tip percentage: ");
        double tipPercent = input.nextDouble();
        input.nextLine();

        double tipAmount = (subtotal * (tipPercent / 100));

        System.out.println("Tip amount: $" + tipAmount);
        System.out.print("Total amount: $" + (subtotal + tipAmount));

    }
}