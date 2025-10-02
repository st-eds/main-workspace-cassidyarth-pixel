import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hour: ");
        int hour = input.nextInt();

        System.out.print("Enter the minutes: ");
        int minute = input.nextInt();
        input.nextLine();
        System.out.print("AM or PM? ");
        String time = input.nextLine();

        System.out.print("\nTime: " + hour + ":" + minute + " " + time);

    }
}