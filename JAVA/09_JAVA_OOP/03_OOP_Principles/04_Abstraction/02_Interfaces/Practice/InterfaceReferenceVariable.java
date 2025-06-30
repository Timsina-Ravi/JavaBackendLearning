// Interface as a type
interface Speaker {
    void speak();
}

// Class implements the interface
class Person implements Speaker {
    @Override
    public void speak() {
        System.out.println("Person speaking");
    }
}

public class InterfaceReferenceVariable {
    public static void main(String[] args) {
        Speaker s = new Person(); // Interface reference to object of implementing class
        s.speak();                // Polymorphic method call
    }
}

