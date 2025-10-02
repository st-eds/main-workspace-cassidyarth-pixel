import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double numb1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the second number: ");
        double numb2 = input.nextDouble();
        input.nextLine();

        System.out.println(numb1 + " plus " + numb2 + " equals " + (numb1 + numb2));
        System.out.println(numb1 + " minus " + numb2 + " equals " + (numb1 - numb2));
        System.out.println(numb1 + " times " + numb2 + " equals " + (numb1 * numb2));
        System.out.println(numb1 + " divided by " + numb2 + " equals " + (numb1 / numb2));

    }
}