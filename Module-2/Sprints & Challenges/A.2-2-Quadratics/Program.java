import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coefficent a: ");
        int aCoef = input.nextInt();

        System.out.print("Enter the coefficent b: ");
        int bCoef = input.nextInt();

        System.out.print("Enter the coefficent c: ");
        int cCoef = input.nextInt();

        input.nextLine();

        double discriminant = (Math.pow(bCoef, 2) - (4 * aCoef * cCoef));

        if (discriminant > 0 ) {
            int r1 = (int)((0-bCoef + Math.sqrt(discriminant)) / (2*aCoef));
            int r2 = (int)((0-bCoef - Math.sqrt(discriminant)) / (2*aCoef));

            System.out.println("The roots of the equation are: " + r1 + " and " + r2);
        }
        
        else if (discriminant == 0) {
            int r1 = (int)((0-bCoef + Math.sqrt(discriminant)) / (2*aCoef));

            System.out.println("The root of the equation is: " + r1);
        }

        else {
            System.out.println("There are no real roots.");
        }
    }
}