import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double pounds = input.nextDouble();
        input.nextLine();

        System.out.print("Enter your height in inches: ");
        double inches = input.nextDouble();
        input.nextLine();

        double bmi = (pounds / (Math.pow(inches, 2))) * 703;

        System.out.print("Your BMI is " + bmi + ", ");

        if (bmi < 18.5) {
            System.out.println("which is considered Underweight.");
        }
        else if (18.5 <= bmi && bmi < 24.9) {
            System.out.println("which is considered Normal weight.");
        }
        else if (25 <= bmi && bmi < 29.9) {
            System.out.println("which is considered Overweight.");
        }
        else {
            System.out.println("which is considered Obese.");
        }
    }
}