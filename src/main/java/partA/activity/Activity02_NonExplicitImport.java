package partA.activity;

public class Activity02_NonExplicitImport {
    public static void main(String[] args) {
        System.out.println("Let's play some craps! Throw the dice!");
        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.println("You rolled a: " + diceRoll);
    }
}
