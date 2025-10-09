import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Demo 1 - 99 Bottles Song ---");

        System.out.print("Enter your favorite soda: ");
        String sode = input.nextLine();
        int bottles = 99;

        while (bottles > 0) {
            System.out.println(bottles + " bottles of " + soda + " on the wall,");
            System.out.println(bottles + " bottles of " + soda + "!");
            System.out.println("You take one down, pass it around,");
            bottles--;
            System.out.println(bottles + " bottles of " + soda " on the wall!");

            String bypass = input.nextLine();

            if (bypass.equals("bypass")) {
                bottles
            }
        }
        
    }
}