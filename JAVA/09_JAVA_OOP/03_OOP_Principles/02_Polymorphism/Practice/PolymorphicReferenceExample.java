//  POLYMORPHIC REFERENCE

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}

public class PolymorphicReferenceExample {
    public static void main(String[] args) {
        Animal animal = new Cat();  // Parent reference → Child object
        animal.speak();             // Calls Cat's overridden method
    }
}

