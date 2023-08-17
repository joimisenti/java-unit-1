import java.util.Scanner;

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
    }

}