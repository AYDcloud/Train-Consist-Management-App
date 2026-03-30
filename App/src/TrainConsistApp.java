import java.util.*;

// 🔹 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🔹 Bogie Class
class Bogie {
    int id;
    int capacity;
    String type;

    // Constructor with validation
    public Bogie(int id, int capacity, String type) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0!");
        }
        this.id = id;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity + ", Type: " + type;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        try {
            // ✅ Valid bogie
            bogies.add(new Bogie(1, 60, "Passenger"));

            // ❌ Invalid bogie (will throw exception)
            bogies.add(new Bogie(2, 0, "Passenger"));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies only
        System.out.println("\nFinal Bogie List:");
        bogies.forEach(System.out::println);
    }
}