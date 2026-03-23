import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        LinkedHashSet<String> bogies = new LinkedHashSet<>();

        bogies.add("Engine");
        bogies.add("Sleeper");
        bogies.add("Cargo");
        bogies.add("Guard");
        bogies.add("Sleeper");

        System.out.println("Train Formation:");
        System.out.println(bogies);
    }
}