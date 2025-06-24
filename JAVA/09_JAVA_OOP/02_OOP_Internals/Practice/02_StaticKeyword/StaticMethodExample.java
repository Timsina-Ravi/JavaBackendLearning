
//Create a class MathUtil with a static method square(int x) and call it without creating an object.

public class StaticMethodExample {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        // Call static method directly using class name
        System.out.println("Square of 5: " + MathUtil.square(5));
    }
}

