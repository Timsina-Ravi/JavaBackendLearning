// DYNAMIC METHOD DISPATCH
// Decision of which method to call happens at runtime

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running fast");
    }
}

public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        Vehicle v = new Bike();  // Superclass reference → subclass object
        v.run();                 // At runtime, JVM calls Bike's run()
    }
}

