// Abstract method forces subclasses to provide implementation
abstract class Vehicle {
    abstract void start();
}

// Subclass implements the abstract method
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class ForcingSubclassImplementation {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();  // Calls implemented method in subclass
    }
}

