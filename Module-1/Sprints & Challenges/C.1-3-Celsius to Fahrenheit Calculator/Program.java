import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Celsius to Fahrenheit Calculator");

        System.out.print("Input the temperature in Celsius: ");
        int celsius = input.nextInt();
        input.nextLine();

        System.out.print(celsius + "°C is equal to " + (celsius * 1.8 + 32) + "°F.");
    }
}