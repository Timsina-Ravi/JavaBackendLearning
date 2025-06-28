// Demonstrating why Java does not support hybrid inheritance via classes

class A {
    void display() {
        System.out.println("Display from A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Display from B");
    }
}

class C extends A {
    void displayC() {
        System.out.println("Display from C");
    }
}

// ❌ Invalid: Java doesn't allow a class to inherit from both B and C (which already extend A)
/*
class D extends B, C { // ❌ Compilation error
    public static void main(String[] args) {
        D obj = new D();
        obj.display();
    }
}
*/

public class HybridInheritanceNotSupported {
    public static void main(String[] args) {
        System.out.println("Java does NOT support hybrid inheritance via classes because it leads to multiple inheritance.");
        System.out.println("This causes ambiguity when methods are inherited from multiple class paths.");
    }
}

