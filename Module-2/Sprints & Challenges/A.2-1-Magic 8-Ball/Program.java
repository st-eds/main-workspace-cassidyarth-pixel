import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ask the Magic 8-Ball a question: ");
        input.nextLine();

        int answer = (int)(Math.random() * 5);

        // System.out.println(answer);

        if (answer == 0) {
            System.out.println("It is certain.");
        }
        else if (answer == 1) {
            System.out.println("Without a doubt.");
        }
        else if (answer == 2) {
            System.out.println("Ask again later.");
        }
        else if (answer == 3) {
            System.out.println("Cannot predict now.");
        }
        else if (answer == 4) {
            System.out.println("Don't count on it.");
        }
        else {
            System.out.println("Outlook not so good.");
        }
    }
}