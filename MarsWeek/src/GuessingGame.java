import java.util.Scanner;
import java.util.Random;

public class GuessingGame {


    // Guessing Game constructor
    public GuessingGame() {
//        this.someText = someText;
//        this.someDecimal = someDecimal;
//        this.someNumber = someNumber;
    }

    public static void main(String args[]) {

        System.out.println("Howdy, what's your name?");
        System.out.println("(type in your name)");

        Scanner scan = new Scanner(System.in);

        String playerName = scan.nextLine();

        System.out.println(playerName + ", I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");

        Random rand = new Random();

        int randNumber = rand.nextInt(100);

        System.out.print("Your guess? ");
        int guess = scan.nextInt();
        int countGuesses = 1;

        if (guess != randNumber) {
            while (guess != randNumber) {
                countGuesses++;
                if (guess < randNumber) {
                    System.out.println("Your guess is too low, try again.");
                    System.out.print("Your guess? ");
                    guess = scan.nextInt();
                } else if (guess > randNumber) {
                    System.out.println("Your guess is too high, try again.");
                    System.out.print("Your guess? ");
                    guess = scan.nextInt();
                }
            }
        } else {
            System.out.println("Well done, " + playerName + "! You found my number in " + countGuesses + " tries!");
        }
        if (guess == randNumber) {
            System.out.println("Well done, " + playerName + "! You found my number in " + countGuesses + " tries!");
        }
    }
}