import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name of item 1: ");
        String item1 = input.nextLine();
        System.out.print("Weight of " + item1 + "(lbs): ");
        double item1Weight = input.nextDouble();
        input.nextLine();

        System.out.println();

        System.out.print("Name of item 2: ");
        String item2 = input.nextLine();
        System.out.print("Weight of " + item2 + "(lbs): ");
        double item2Weight = input.nextDouble();
        input.nextLine();

        System.out.println();

        System.out.print("Name of item 3: ");
        String item3 = input.nextLine();
        System.out.print("Weight of " + item3 + "(lbs): ");
        double item3Weight = input.nextDouble();
        input.nextLine();

        System.out.println();

        System.out.println("- Weight -");
        System.out.println(item1 + ": " + item1Weight + "lbs");
        System.out.println(item2 + ": " + item2Weight + "lbs");
        System.out.println(item3 + ": " + item3Weight + "lbs");

        System.out.println();

        System.out.println("Total weight: " + (item1Weight + item2Weight + item3Weight) + "lbs");

    }
}