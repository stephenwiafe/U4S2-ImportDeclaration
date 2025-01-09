package partA.example;

import java.util.Scanner;

public class Example01_ExplicitImport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //gets input from user
        System.out.println("Hello user, please enter a number."); //prompt user to enter a number
        int numEntered = sc.nextInt(); // user number gets stored in here
        System.out.println("You entered " + numEntered); // prints out a message with the user number entered
    }
}
