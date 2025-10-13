import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is the PC Powering on? [yes/no] ");

        String query = input.nextLine();

        // PC power
        if (query.equals("yes") || query.equals("Yes") || query.equals("YES")) {
            System.out.print("Is there any display on the monitor? [yes/no] ");
            query = input.nextLine();

            // Monitor Display
            if (query.equals("yes") || query.equals("Yes") || query.equals("YES")) {
                System.out.print("Is the PC booting into the OS? [yes/no] ");
                query = input.nextLine();

                // OS booting
                if (query.equals("yes") || query.equals("Yes") || query.equals("YES")) {
                    System.out.print("Is the PC running slowly or freezing? [yes/no] ");
                    query = input.nextLine();

                    // Finale
                    if (query.equals("yes") || query.equals("Yes") || query.equals("YES")) {
                        System.out.println("Check for malware, update drivers, and ensure there is enough free disk space. If the problem persists, consider upgrading the hardwaree.");
                    }

                    else {
                        System.out.println("The PC is functioning normally.");
                    }
                }

                else {
                    System.out.println("Check the BIOS settings and ensure the boot drive is properly connected. If the problem persists, try booting from a different drive or reinstalling the operating system.");
                }

            }

            else {
                System.out.println("Check the monitor connections and ensure the monitor is turned on. If the problem persists, try using a different monitor or graphics card.");
            }
        }

        else {
            System.out.println("Check the power supply connections and ensure the power outlet is working. If the problem persists, replace the power supply.");
        }
        
    }
}