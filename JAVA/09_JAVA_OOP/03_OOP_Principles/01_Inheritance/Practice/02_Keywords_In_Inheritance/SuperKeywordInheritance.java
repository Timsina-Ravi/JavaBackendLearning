// 🟢 Usage of the `super` keyword in inheritance
// Used to access parent class's variables and methods.

class Parent {
    String name = "Parent";

    void display() {
        System.out.println("This is the parent method");
    }
}

class Child extends Parent {
    String name = "Child";

    void showNames() {
        System.out.println("Child name: " + name);        // current class variable
        System.out.println("Parent name: " + super.name); // parent class variable using super
    }

    void display() {
        super.display(); // calls Parent's display()
        System.out.println("This is the child method");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.showNames();
        c.display();
    }
}

