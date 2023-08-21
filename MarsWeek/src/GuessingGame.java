import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {


    // Guessing Game constructor
    public GuessingGame() {
//        this.someText = someText;
//        this.someDecimal = someDecimal;
//        this.someNumber = someNumber;

//    public static void main(String args[]) {

        System.out.println("Howdy, what's your name?");
        System.out.println("(type in your name)");

        Scanner scan = new Scanner(System.in);

        String playerName = scan.nextLine();

        System.out.println(playerName + ", I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");

        Random rand = new Random();

        int randNumber = rand.nextInt(100);

        System.out.print("Your guess? ");
        int countGuesses = 0;

        while (true) {
            int guess;

            try {
                guess = scan.nextInt();
            } catch (InputMismatchException e) {
                String bad_scan = scan.next();
                System.out.println("That's not an integer, try again.");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again.");
                continue;
            }

            countGuesses++;
            if (guess < randNumber) {
                System.out.println("Your guess is too low, try again.");
                System.out.print("Your guess? ");
            } else if (guess > randNumber) {
                System.out.println("Your guess is too high, try again.");
                System.out.print("Your guess? ");
            } else {
                System.out.println("Well done, " + playerName + "! You found my number in " + countGuesses + " tries!");
                break;
            }
        }
    }
}