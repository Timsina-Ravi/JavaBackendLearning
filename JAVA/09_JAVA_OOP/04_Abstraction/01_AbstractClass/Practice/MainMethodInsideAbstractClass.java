// Abstract class can have main method and static methods
abstract class Demo {
    // Static method to demonstrate utility functionality
    static void show() {
        System.out.println("Static method in abstract class");
    }

    // main method inside abstract class, used for quick testing or demos
    public static void main(String[] args) {
        show();  // Calling static method within abstract class
    }
}

