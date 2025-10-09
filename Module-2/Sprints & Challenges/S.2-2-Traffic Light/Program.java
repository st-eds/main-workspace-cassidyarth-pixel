import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a traffic light color: ");
        String lightColor = input.nextLine();
        lightColor = lightColor.toLowerCase();

        if (lightColor.equals("green")) {
            System.out.println("GO!");
        }

        else if (lightColor.equals("yellow")) {
            System.out.println("SLOW!");
        }

        else if (lightColor.equals("red")) {
            System.out.println("STOP!");
        }

        else {
            System.out.println("ERROR!");
        }
        
    }
}