// Abstract class can contain static methods and final constants
abstract class MathUtils {
    // Final constant available to all subclasses
    static final double PI = 3.14159;

    // Static method belongs to class, can be called without object
    static int square(int n) {
        return n * n;
    }
}

public class StaticMethodsAndFinalConstants {
    public static void main(String[] args) {
        // Access static final constant via class name
        System.out.println("PI constant: " + MathUtils.PI);
        // Call static method without creating object
        System.out.println("Square of 7: " + MathUtils.square(7));
    }
}

