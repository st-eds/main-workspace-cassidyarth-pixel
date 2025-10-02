public class Program {
    public static void main(String[] args) {
        System.out.println("Part 1: Basic String and Number Concatenation");
        System.out.println("Hello" + "World");
        System.out.println("Today's number is " + 7);
        System.out.println("Pi is approximately " + 3);
        System.out.println("------------------");

        System.out.println("Part 2: Combining with Math Expressions");
        System.out.println("5 squared is " + (5 * 5));
        System.out.println("The area of a circle with a radius of 4 is " + (4 * 4 * 3.14));
        System.out.println("If I have 25 marbles and my friend gives me 15 more, I have a total of " + (25 + 15) + " marbles.");
        // Ngl i copy pasted that i get the fundamental at hand tho
        System.out.println("-------------------");

        System.out.println("Part 3: Building a full sentence");
        System.out.println("The current year is " + 2024 + ". This is not true.");
        System.out.println("The temp currently is " + 72 + " Fahrenheight.");
        System.out.println("Two dozen is " + (12 + 12) + ".");
        System.out.println("-------------------");

        System.out.println("Part four: convterting expressions to Strings");
        System.out.println("Here is a number " + (10 + 20));
        System.out.println("what if no parenthesus?");
        System.out.println("If you put the string first it all is a string: " + 10 + 20);
        System.out.println("Use parentheses then: " + (10 + 20));


    }
}

// The key difference is that math operations add values numerically and concatination adds the two after one another. Missing a pair of parenthesis would make line 12 have 1215 marbles.
// It's different because numbers in the int and doubles have rules about going up and down while characters are just characters. For this reason, the plus sign moves the number line for numbers and just adds the characters together in succession.
// Parentheses are important because they tell the computer when to use each version of the + and they also denote which ones to do first.