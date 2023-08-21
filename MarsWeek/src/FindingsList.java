import java.util.*;

public class FindingsList {

    // Crate a public constructor
    public FindingsList() throws InterruptedException {
        // empty constructor
//    public static void main (String[] args) throws InterruptedException {
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

        // Storing fossils with a HashMap
        Map<String, String> fossilMap = new HashMap<>();

        fossilMap.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilMap.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilMap.put("Tooth Fossil", "The tooth is from an unknown fossil");

        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, or Tooth)");
        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilMap.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilMap.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilMap.get(fossilChoice));
        }

        Thread.sleep(700);

        // Create a HashSet to store special supplies

        HashSet<String> specialSupplies = new HashSet<>();

        specialSupplies.add("Galvanized Shovel");
        specialSupplies.add("Neon Rainbow Headlamp");
        specialSupplies.add("Zucchini Bread");
        specialSupplies.add("Colonel Sanders' 7 Secret Spices");

        System.out.println("\nSupplies Before Expedition: ");

        for(String supply : specialSupplies) {
            System.out.print("* ");
            System.out.println(supply);
        }

        specialSupplies.remove("Zucchini Bread");

        System.out.println("\nSupplies After Expedition: ");

        Iterator itr = specialSupplies.iterator();

        while(itr.hasNext()) {
            System.out.println("* " + itr.next());
        }

    }
}