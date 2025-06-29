// Abstract class can have both concrete and abstract methods
abstract class Animal {
    // Concrete method: implemented in abstract class, inherited as is
    void breathe() {
        System.out.println("Animal is breathing");
    }
    
    // Abstract method: no body, forces subclasses to provide implementation
    abstract void sound();
}

// Concrete subclass must implement all abstract methods
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractAndConcreteMethods {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.breathe();  // Calls concrete method from abstract class
        d.sound();    // Calls overridden abstract method
    }
}

