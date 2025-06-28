// 🟢 Multilevel Inheritance Example
// Class Child inherits from Parent, which inherits from Grandparent.

class Grandparent {
    void greet() {
        System.out.println("Hello from Grandparent");
    }
}

class Parent extends Grandparent {
    void talk() {
        System.out.println("Talking from Parent");
    }
}

class Child extends Parent {
    void play() {
        System.out.println("Playing from Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.greet(); // from Grandparent
        c.talk();  // from Parent
        c.play();  // from Child
    }
}

