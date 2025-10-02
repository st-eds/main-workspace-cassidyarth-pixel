public class Program {
    public static void main(String[] args) {
        // Addition
        System.out.println("1 + 2 equals");
        System.out.println(2+1);
        System.out.println();

        System.out.println("$1000 and $500.96 equals");
        System.out.println("$" + (1000 + 500.96));
        System.out.println();

        // Subtraction
        System.out.println("3 apples minus 1 apple equals");
        System.out.println(3 - 1 + " apples");
        System.out.println();

        // Multiplication
        System.out.println("I'm 30 years old in. That's ");
        System.out.println(30 * 12 + " months");
        System.out.println();

        // Division w/ integers and doubles
        System.out.println("What is 8 divided by 2 in pizza terms");
        System.out.println(8 / 2 + "pizzas");
        System.out.println();

        System.out.println("$100 divided among 6 people is");
        System.out.println("$" + (100.0 / 6));
        System.out.println("Again but without doubles");
        System.out.println("$" + (100 / 6));
        System.out.println();

        // Remainder using the mod operator
        System.out.println("What's the remainder?");
        System.out.println("$" + (100 % 6));
        System.out.println();

        // Order of operations
        System.out.println("What is 4 times 10 + 12?");
        System.out.println(4 * 10 + 12);
        System.out.println("Ok what abt 4 times (10 + 12)?");
        System.out.println(4 * (10 + 12));
        System.out.println();

        // The / operator is for division, whereas % is for the remainder.
        // You would use / to find a division answer, and % to find how much is left over after. See line 30 and 35.
        
        // It's important to differentiate because sometimes there can't be a decimal of someone, like .5 of a person.
        // A decimal number gives you the completest answer of a divison problem however.

        // It's important to use parentheses to make sure artithmetic statements calculate in the proper order you want.

    }
}