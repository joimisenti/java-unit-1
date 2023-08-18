import java.util.ArrayList;
import java.util.Arrays;

public class FindingsList {

    // Crate a public constructor
    public FindingsList() throws InterruptedException {
        // empty constructor
    }
    public static void main (String[] args) throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back from your expedition! Time to catalog everything you found!");

        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println("Everything has successfully downloaded. Here is your current rock collection:");
        System.out.println(rockList);

        System.out.println("A non-rock has been identified. We need to destroy it.");

        rockList.remove("not rock");

        System.out.println(rockList);

        Thread.sleep(1000);
    }
}