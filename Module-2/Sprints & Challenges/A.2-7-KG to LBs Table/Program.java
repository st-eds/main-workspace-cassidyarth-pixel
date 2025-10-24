import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many rows? ");
        int iteration = input.nextInt();

        System.out.println("Kilograms\tPounds");

        for (int i = 1; i <= iteration; i++) {
            for (int j = 0; j <= 1; j++) {
                if (j == 0) {
                    System.out.print(i);
                }

                else {
                    System.out.print(String.format("\t %.1f", (i * 2.2)));
                }
            }
            System.out.println();
        }
        
    }
}