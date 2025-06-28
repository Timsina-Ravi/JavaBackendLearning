// METHOD OVERRIDING - Runtime Polymorphism

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound() method from Animal
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Calls overridden method in Dog
    }
}

