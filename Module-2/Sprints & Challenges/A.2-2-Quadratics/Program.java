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

        System.out.println(discriminant);
        
    }
}