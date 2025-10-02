public class Program {
    public static void main(String[] args) {
        // Strings type shi
        System.out.println("About me");
        String person = "Arthur";
        String food = "Chicken";

        System.out.println("Hello my name is " + person + "!");
        System.out.println("I, " + person + ", love to eat " + food);
        System.out.println();

        System.out.println("Toung twister");
        String item = "shoes";
        System.out.println("Say this five times fast!");
        System.out.println("Peter piper picked a pack of pickled " + item);
        System.out.println("A peck of pickled " + item + " he picked.");
        System.out.println("If Peter Piper picked a peck of " + item + ",");
        System.out.println("Where's the peck of " + item + " he picked?");
        System.out.println("");
        
        System.out.println("Health demo");
        int health = 100;
        int damage = 55;
        System.out.println("You've taken " + damage + " damage, so you have " + health + " health.");
        System.out.println("");

        System.out.println("Age demo");
        int age = 17;
        System.out.println("you will reach age 100 in " + (100 - age) + " years.");
        System.out.println("");

        System.out.println("Money demo");
        double balance = 100.25;
        double withdraw = 45.11;
        double leftover = balance - withdraw;
        System.out.println("You have $" +balance+ " in you account.");
        System.out.println("If you take $" + withdraw + ", you will have $" + leftover + ".");
    }
}

// They make it easier as you can save numbers, repeat them, and refer to them easily
// It's important because it makes it easy to remember and understand why a varbible has a value
// You can define variables and modify them with math