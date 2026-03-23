import java.util.HashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        HashSet<String> bogieIds = new HashSet<>();

        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B101");
        bogieIds.add("B102");

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);
    }
}