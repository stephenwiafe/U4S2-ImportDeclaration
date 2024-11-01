package partA.example;

import java.util.Scanner;

public class Example01_ExplicitImport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello user, please enter a number.");
        int numEntered = sc.nextInt();
        System.out.println("You entered " + numEntered);
    }
}
