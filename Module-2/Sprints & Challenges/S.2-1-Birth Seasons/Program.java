import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int month = input.nextInt();
        input.nextLine();

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("You're a winter baby!");
        }
        
        else if (month == 3 || month == 4 || month == 5) {
            System.out.println("You're a spring baby!");
        }

        else if (month == 6 || month == 7 || month == 8) {
            System.out.println("You're a summer baby!");
        }

        else if (month == 9 || month == 10 || month == 11) {
            System.out.println("You're a fall baby!");
        }

        else {
            System.out.println("Error!");
        }
    }
}