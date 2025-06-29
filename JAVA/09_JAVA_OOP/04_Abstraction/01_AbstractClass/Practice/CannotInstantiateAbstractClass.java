// Abstract class with abstract method
abstract class Parent {
    abstract void greet();
}

// Subclass implements abstract method
class Child extends Parent {
    @Override
    void greet() {
        System.out.println("Hello from Child");
    }
}

public class CannotInstantiateAbstractClass {
    public static void main(String[] args) {
        // Cannot instantiate abstract class directly - compile error:
        // Parent p = new Parent();

        // Correct: instantiate subclass which implements all abstract methods
        Child c = new Child();
        c.greet();  // Calls implemented method
    }
}

