//  STATIC, FINAL, and PRIVATE methods are NOT overridable

class Parent {

    static void staticMethod() {
        System.out.println("Static method in Parent");
    }

    final void finalMethod() {
        System.out.println("Final method in Parent");
    }

    private void privateMethod() {
        System.out.println("Private method in Parent");
    }
}

class Child extends Parent {

    // This is NOT overriding — it's hiding the static method
    static void staticMethod() {
        System.out.println("Static method in Child");
    }

    // Cannot override finalMethod() — would cause compile error
    // Cannot override privateMethod() — it's not visible

}

public class NonOverridableMethodsExample {
    public static void main(String[] args) {
        Parent.staticMethod();  // Calls Parent version
        Child.staticMethod();   // Calls Child version
    }
}

