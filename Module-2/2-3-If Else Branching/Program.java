import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Chinese Zodiac Calender ---");
        System.out.print("Enter your birth year: ");

        int birthYear = input.nextInt();
        int zodiacNumber = birthYear % 12;
        String zodiacAnimal;

        input.nextLine();

        if (zodiacNumber == 0) {
            zodiacAnimal = "monkey";
        }

        else if (zodiacNumber == 1) {
            zodiacAnimal = "rooster";
        }

        else if (zodiacNumber == 2) {
            zodiacAnimal = "dog";
        }

        else if (zodiacNumber == 3) {
            zodiacAnimal = "pig";
        }

        else if (zodiacNumber == 4) {
            zodiacAnimal = "rat";
        }

        else if (zodiacNumber == 5) {
            zodiacAnimal = "ox";
        }

        else if (zodiacNumber == 6) {
            zodiacAnimal = "tiger";
        }

        else if (zodiacNumber == 7) {
            zodiacAnimal = "rabbit";
        }

        else if (zodiacNumber == 8) {
            zodiacAnimal = "dragon";
        }

        else if (zodiacNumber == 9) {
            zodiacAnimal = "snake";
        }

        else if (zodiacNumber == 10) {
            zodiacAnimal = "horse";
        }

        else if (zodiacNumber == 11) {
            zodiacAnimal = "sheep";
        }

        else {
            System.out.println("Error: invalid input!");
            zodiacAnimal = "something went wrong";
        }

        System.out.println("\nBirth Year: " + birthYear + " - You are the year of the " + zodiacAnimal + "!");
        input.nextLine();

        //

        System.out.println("\n---Lottery Game ---\n");

        System.out.println("Rules: Pick two lottery numbers ranging from 0 to 9.");
        System.out.println("Match one number and win little, match both and win BIG!!!\n");

        System.out.print("Enter your 1st lottery number (0 - 9): ");
        int lottoNum1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter your 2nd lottery number (0 - 9): ");
        int lottoNum2 = input.nextInt();
        input.nextLine();

        int winningNum1 = (int)(Math.random() * 10);
        int winningNum2 = (int)(Math.random() * 10);

        if (lottoNum1 < 0 || lottoNum1 > 9 || lottoNum2 < 0 || lottoNum2 > 9) {
            System.out.println("Error: Your lotto numbers are invalid. Exiting...");
            System.exit(0);
        }

        System.out.println("The winning numbers are " + winningNum1 + " and " + winningNum2);

        if (lottoNum1 == winningNum1 && lottoNum2 == winningNum2) {
            System.out.println("You win BIG!");
        }

        else if (lottoNum1 == winningNum1 || lottoNum2 == winningNum2) {
            System.out.println("You win SMALL!");
        }

        else {
            System.out.println("You lose! Better luck next time!");
        }
    }
}

// Using multiple else if statements instead of multiple if statements ensures you can control what one outcome occurs instead of having to over code in the if clauses
// The else statement ensures that anything the programmer didn't account for still allows the code to keep moving on instead of erroring out.