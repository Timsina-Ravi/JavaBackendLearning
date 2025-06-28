// Demonstrating why Java does not support multiple inheritance via classes

class A {
    void show() {
        System.out.println("Class A method");
    }
}

class B {
    void show() {
        System.out.println("Class B method");
    }
}

// ❌ Invalid: A class cannot extend more than one class in Java
/*
class C extends A, B { // ❌ Compilation error
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
*/

public class MultipleInheritanceNotSupported {
    public static void main(String[] args) {
        System.out.println("Java does NOT support multiple inheritance via classes to avoid ambiguity.");
        System.out.println("For example, if both A and B had a 'show()' method, Java wouldn't know which one to call.");
    }
}

