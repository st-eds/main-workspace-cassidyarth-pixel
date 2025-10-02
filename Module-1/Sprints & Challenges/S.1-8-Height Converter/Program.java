import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in inches: ");
        int totalInches = input.nextInt();
        input.nextLine();

        int feet = totalInches / 12;
        int inches = totalInches % 12;

        System.out.println("Your height is " + feet + " feet " + inches + " inches.");

    }
}