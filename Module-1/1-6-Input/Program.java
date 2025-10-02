
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Start your code here

        // Ok

        Scanner input = new Scanner(System.in);

        String task1;
        String task2;
        String task3;

        System.out.println("---Demo 1 - Simple to-do list---");
        System.out.println("Let's add a few tasks to your list.");

        System.out.print("Task 1: ");
        task1 = input.nextLine();
        System.out.print("Task 2: ");
        task2 = input.nextLine();
        System.out.print("Task 3: ");
        task3 = input.nextLine();

        System.out.println("\nYour To-Do List:");
        System.out.println("1. " + task1);
        System.out.println("2. " + task2);
        System.out.println("3. " + task3);
        System.out.print("Press enter to continue...");
        input.nextLine();

        //

        System.out.println("\n---Demo 2 - User Profile---");
        System.out.print("Enter your username: ");
        String username = input.nextLine();
        System.out.print("what is your favorite subject ");
        String subject = input.nextLine();

        System.out.println("Favorie Activity? \n-Sports \n-Music \n-Gaming \n-Volunteering");
        System.out.print("-> ");

        String activity = input.nextLine();

        System.out.println("\n- Creating Profile -");
        System.out.println("Name: " + username);
        System.out.println("Favorite Subject: " + subject);
        System.out.println("Favorite activity: " + activity);
        System.out.println("Press enter to continue... ");
        input.nextLine();

        //

        System.out.println("\n---Demo 3 - Simple Survey---");
        System.out.print("We'd love to get feedback. \nWhat's your favorite color? ");
        String favoriteColor = input.nextLine();
        System.out.print("What is your favorite food? ");
        String favoriteFood = input.nextLine();
        System.out.print("Goat vaccination spot? ");
        String travelDestination = input.nextLine();

        System.out.println("\n-Favorite survey Results-");
        System.out.println("Color: " + favoriteColor + "\nFood: " + favoriteFood + "\nTravel Destination: " + travelDestination);
        System.out.print("Press enter... ");
        input.nextLine();

        //

        System.out.print("\n---Demo 4 - Fantasy Story Builder --- \n Lets create a fantasy story \nName your main character: ");
        String mainCharacter = input.nextLine();
        System.out.print("Name a creature: ");
        String magicalCreature = input.nextLine();
        System.out.print("Name a place: ");
        String magicalPlace = input.nextLine();

        System.out.println("\n Your Story: \nOnce upon a time, a hero named " + mainCharacter + " traveled to the " + magicalPlace + " and found a " + magicalCreature + ".");
        System.out.println("Their quest was just beginning... ");

    }
}

// The scanner next line method allows you to take user input and regurgitate it back into the program
// It is important to store user input into a variable so that way you can repeat it into a different system out print ln