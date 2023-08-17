public class Mars {
    public static void main(String[] args) throws InterruptedException {

        String colonyName = "Kumquat";

        int shipPopulation = 300;

        double meals = 4000.00;

        boolean landing = true;

        meals = meals - (0.75 * 2 * shipPopulation);
        System.out.println(meals);

        meals = meals * 1.5;

        shipPopulation += 5;

        String landingLocation = "The Plain";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain.");
        }

        landing = landingCheck(10);

        // Run the guessing game
        new GuessingGame();
    }
        /**
         * Function name: landingCheck
         *
         * @param: minutesLeft (int)
         * return: boolean
         *
         * Inside the function:
         *  1. This function will print directions to the console based on minutes left until touchdown.
         */
    public static boolean landingCheck (int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if ((minute % 2) == 0 && (minute % 3) == 0) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}