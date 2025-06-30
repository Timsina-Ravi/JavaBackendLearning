// Outer class containing a nested interface
class Outer {
    // Interface declared inside Outer class
    interface InnerInterface {
        void show(); // abstract method
    }
}

// Class implements the nested interface using Outer.InnerInterface
class Implementation implements Outer.InnerInterface {
    @Override
    public void show() {
        System.out.println("Nested interface method implemented");
    }
}

public class NestedInterfaceExample {
    public static void main(String[] args) {
        // Using nested interface as reference type
        Outer.InnerInterface obj = new Implementation(); // polymorphic reference
        obj.show(); // Calls overridden method
    }
}

