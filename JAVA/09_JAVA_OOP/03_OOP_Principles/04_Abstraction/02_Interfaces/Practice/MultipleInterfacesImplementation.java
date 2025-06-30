// First interface
interface Walkable {
    void walk();
}

// Second interface
interface Runnable {
    void run();
}

// Class implements multiple interfaces using comma
class Person implements Walkable, Runnable {
    @Override
    public void walk() {
        System.out.println("Person is walking");
    }

    @Override
    public void run() {
        System.out.println("Person is running");
    }
}

public class MultipleInterfacesImplementation {
    public static void main(String[] args) {
        Person p = new Person(); // Create object
        p.walk();                // Call walk method
        p.run();                 // Call run method
    }
}

