// 🟢 Hierarchical Inheritance Example
// Multiple classes inherit from a single parent class.

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog's own method

        Cat c = new Cat();
        c.eat();   // inherited from Animal
        c.meow();  // Cat's own method
    }
}

