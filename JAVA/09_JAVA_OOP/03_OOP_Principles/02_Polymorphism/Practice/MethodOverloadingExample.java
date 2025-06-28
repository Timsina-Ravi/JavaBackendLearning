// METHOD OVERLOADING - Compile-Time Polymorphism

public class MethodOverloadingExample {

    // Method with no parameters
    void greet() {
        System.out.println("Hello!");
    }

    // Overloaded method with one parameter
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded method with two parameters
    void greet(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();

        obj.greet();              // No-arg version
        obj.greet("Ravi");        // One-arg version
        obj.greet("Ravi", 25);    // Two-arg version
    }
}

