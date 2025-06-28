// 🟢 Single Inheritance Example
// One class inherits directly from another class.

class Parent {
    void show() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the Child class");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();    // inherited method from Parent
        c.display(); // method in Child class
    }
}

