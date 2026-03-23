import java.util.ArrayList;

public class TrainConsistApp {

    public static void main(String[] args) {

        ArrayList<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println(bogies);

        bogies.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(bogies);

        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        System.out.println("\nFinal Bogie List:");
        System.out.println(bogies);
    }
}