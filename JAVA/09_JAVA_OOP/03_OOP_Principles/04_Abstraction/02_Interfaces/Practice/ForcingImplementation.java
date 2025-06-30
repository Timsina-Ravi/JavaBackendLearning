// Interface defining required behavior
interface Vehicle {
    void start();
    void stop();
}

// Class must provide implementations for all interface methods
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}

public class ForcingImplementation {
    public static void main(String[] args) {
        Car c = new Car(); // Create object
        c.start();         // Call start method
        c.stop();          // Call stop method
    }
}

