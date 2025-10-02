import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Demo 1 - Age Validator ---");

        System.out.print("Enter your age: ");
        int userAge = input.nextInt();
        input.nextLine();

        if (userAge >= 16) {
            System.out.println("Time to hit the road with your driving permit.\n");
        }

        if (userAge >= 18) {
            System.out.println("You can now vote and live independently.");
            System.out.println("Please exit your mom's basement.\n");
        }

        if (userAge >= 35) {
            System.out.println("You're old enough to run for president.");

            System.out.print("Enter your full name: ");
            String fullName = input.nextLine();

            System.out.print("What year will you run? ");
            String electionYear = input.nextLine();

            System.out.print("What's your nickname? ");
            String nickName = input.nextLine();

            System.out.println(nickName + " " + fullName + " for president in " + electionYear + "!");

        }

        System.out.println("Press enter to continue...");
        input.nextLine();

        //

        System.out.println("\n--- Demo 2 - Simple Score Calc (short for calculator) ---");

        System.out.print("Enter your score (0-100): ");
        int score = input.nextInt();

        if (score >= 60) {
            System.out.println("You passed!");
        }

        if (score < 60) {
            System.out.println("You didn't pass. Keep studying!");
        }

        System.out.println("Press enter to continue...");
        input.nextLine();

        //

        System.out.println("\n--- Demo 3 - Temperature Check ---");

        System.out.print("What is the current temperature in Fahrenheit? ");
        int currentTemp = input.nextInt();
        input.nextLine();

        if (currentTemp <= 32 ) {
            System.out.println("Brrr! Pooh Shiesty! It's freezing, don't forget your coat!");
        }

        if (currentTemp > 32 && currentTemp <= 65) {
            System.out.println("It's a bit chilly. A light jacket should be perfect.");
        }

        if (currentTemp > 65) {
            System.out.println("It's warm outside. Enjoy the nice weather!");
        }

        System.out.println("Press enter to continue...");
        input.nextLine();

        //

        System.out.println("\n--- Demo 4 - Letter Grade Calculator ---");

        System.out.print("Enter your final grade percentage (0-100): ");
        int finalGrade = input.nextInt();
        input.nextLine();

        if (finalGrade >= 90) {
            System.out.println("You got an A! Excellent work!");
        }

        if (finalGrade >= 80 && finalGrade < 90) {
            System.out.println("You got a B! Great job!");
        }

        if (finalGrade >= 70 && finalGrade < 80) {
            System.out.println("You got a C! Great job!");
        }

        if (finalGrade >= 60 && finalGrade < 70) {
            System.out.println("You got a D! Great job!");
        }

        if (finalGrade < 60) {
            System.out.println("You got an F! Let's review the material again maybe.");
        }
    }
}