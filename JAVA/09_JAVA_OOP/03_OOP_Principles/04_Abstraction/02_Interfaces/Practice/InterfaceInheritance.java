// First base interface
interface A {
    void methodA();
}

// Second base interface
interface B {
    void methodB();
}

// Interface C inherits from both A and B
interface C extends A, B {
    void methodC();
}

// Class implements interface C and must implement all inherited methods
class Impl implements C {
    @Override
    public void methodA() {
        System.out.println("Method A implemented");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implemented");
    }

    @Override
    public void methodC() {
        System.out.println("Method C implemented");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Impl obj = new Impl(); // Create object of class
        obj.methodA();         // Call method from interface A
        obj.methodB();         // Call method from interface B
        obj.methodC();         // Call method from interface C
    }
}

