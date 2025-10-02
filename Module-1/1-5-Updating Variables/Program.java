public class Program {
    public static void main(String[] args) {
        System.out.println("-- Demo 1 Battle --");
        int playerHealth = 100;
        int playerAttack = 25;
        int enemyHealth = 100;
        int enemyAttack = 20;
        int potions = 3;

        System.out.println("Health: " + playerHealth);
        System.out.println("Enemy Health: " + enemyHealth);
        System.out.println();

        System.out.println("player attacks!");
        enemyHealth = enemyHealth - playerAttack;
        System.out.println("Dealt " + playerAttack + " damage! Enemy health: " + enemyHealth);
        System.out.println();

        System.out.println("Enemy Attacks");
        playerHealth = playerHealth - enemyAttack;
        System.out.println("Enemy did " + enemyAttack + " damage, you are at " + playerHealth);
        System.out.println();

        System.out.println("Using potion...");
        playerHealth = playerHealth + playerHealth;
        potions = potions - 1;
        System.out.println("Health: " + playerHealth + ". Potions: " + potions);
        System.out.println();

        //-----------------------------------------

        System.out.println("-- Banking sim --");
        String accountName = "Checking Account";
        double balance = 100.50;

        System.out.println(accountName + " balance: " + balance);
        System.out.println("Depositing $99.01 to the account");
        balance = balance + 99.01;
        System.out.println(accountName + " balance: " + balance);
        System.out.println("\n\n");

        //-----------------------------------------

        System.out.println("-- Demo 3 - High Score --");
        int playerScore = 0;
        System.out.println("Current Score: " + playerScore);
        System.out.println("Scored a hunnid pounts");
        playerScore = playerScore + 100;
        System.out.println("New score: " + playerScore);
        System.out.println("Scored five hunnid points");
        playerScore = playerScore + 500;
        System.out.println("New score: " + playerScore);
        System.out.println("\n\n");

        //------------------------------------------

        System.out.println("-- Social Media analysus --");
        int likes = 23;
        System.out.println("Post likes: " + likes);
        System.out.println("Friend liked post");
        likes = likes + 1;
        System.out.println("Post likes: " + likes);
        System.out.println("10 more people liked post");
        likes = likes + 10;
        System.out.println("Post likes = " + likes); 

    }
}

// When you initialize a variable you define its name and type along with its value. This is different then simply updating the value. Its important to declare variable type so that the value is interperted correctly
// Updating the variable value simulated the same account growing after a user makes an input. If we didn't update the value, the variable/account wouldn't persist.