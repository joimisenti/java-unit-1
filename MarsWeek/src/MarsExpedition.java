import java.util.Scanner;

public class MarsExpedition {

    // Create a public constructor
    public MarsExpedition() throws InterruptedException{
        // empty

//    public static void main(String args[]) throws InterruptedException{

        // Create new Scanner variable named input to store the user's input

        Scanner input = new Scanner(System.in);

        // Print a bootup message

        System.out.println("Systems initializing...");
        Thread.sleep(100);
        System.out.println("Positrons positing...");
        Thread.sleep(250);
        System.out.println("Negatrons nerfing...");
        Thread.sleep(250);
        System.out.println("Pikachus facing...");
        Thread.sleep(1000);
        System.out.println("Autobots assembling...");
        Thread.sleep(1000);
        System.out.println("Calculating final chaos theory...");
        Thread.sleep(250);
        System.out.println("Pizza delivered. Extra cheese.");

        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("Hi, " + userName + "-- Welcome to the Expedition prep program. Are you ready to head out in the new world? Type Y or N");
        char ready = input.next().charAt(0);

        if (ready == 'Y') {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        // How many people do you want on the team?
        System.out.println("How many people do you want on your expedition team? (Input an int number)");
        int team = input.nextInt();
        input.nextLine();

        if (team > 2) {
            System.out.println("That's way too many people. We can only send 2 more members.");
            team = 2;
        } else if (team < 2) {
            System.out.print("That's too few people. You won't survive. We need you and 2 more members.");
            team = 2;
        } else if (team == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        // Have user choose a vehicle from a lettered or numbered list
        // Use a Switch statement

        System.out.println("Here are the available zooms and scooties you can choose to be your ride-or-die steed: " +
                "\nA: Themberchaud and his holy Roundness" +
                "\nB: a sentient doughnut whose purpose you will always question as possibly better served as dietary rather than transit" +
                "\nC: a noble stallion" +
                "\nD: a spaceship, I guess, if you're into that kind of spacey stuff" +
                "\nE: a goose" +
                "\nF: a Blue-Eyes White Dragon");
        System.out.println("Choose your friend (enter a letter): ");
        String vehicleChoice = input.nextLine();

        switch (vehicleChoice.toUpperCase()) {
            case "A":
                System.out.println("Themberchaud and his holy Roundness");
                vehicleChoice = "Themberchaud and his holy Roundness";
                break;
            case "B":
                System.out.println("a sentient doughnut whose purpose you will always question as possibly better served as dietary rather than transit");
                vehicleChoice = "a sentient doughnut whose purpose you will always question as possibly better served as dietary rather than transit";
                break;
            case "C":
                System.out.println("a noble stallion");
                vehicleChoice = "a noble stallion";
                break;
            case "D":
                System.out.println("a spaceship, I guess, if you're into that kind of spacey stuff");
                vehicleChoice = "a spaceship, I guess, if you're into that kind of spacey stuff";
                break;
            case "E":
                System.out.println("a goose");
                vehicleChoice = "a goose";
                break;
            case "F":
                System.out.println("a Blue-Eyes White Dragon");
                vehicleChoice = "a Blue-Eyes White Dragon";
                break;
            default:
                System.out.println("a hope and a dream, which are both free but lack a gas tank");
        }

        System.out.println("Look at you go. You, " +
                userName +
                " the III, first of their Name, Ruler Regent of the Andals, Rhoynar of the First Men, \nhave assembled a team of " + team +
                " that will be nourished with the most supreme sustenance of " + snack +
                " \nand carried on the expeditious swiftness of " + vehicleChoice);
        System.out.println("You will be popping off the top of an average-height building from an impressively sized cannon in ");

        for (int i = 10; i > 0; i--) {
            if (i <= 3) {
                System.out.println(i + "...");
                Thread.sleep(500);
                continue;
            } else {
                System.out.println(i + "...");
            }
        }
        ;


        System.out.println("BOOSTERS SHOOTIN' and ROCKETS BOOMIN'" + "\nGO GO GO!");


    }
//    }
}