// Interface containing constants (implicitly public static final)
interface Constants {
    int MAX = 100;
    int MIN = 1;
}

// Class can access constants using interface name or directly
class TestConstants implements Constants {
    void show() {
        System.out.println("Max: " + MAX); // Accessing interface constant
        System.out.println("Min: " + MIN);
    }
}

public class InterfaceWithConstants {
    public static void main(String[] args) {
        TestConstants tc = new TestConstants(); // Create object
        tc.show();                              // Show constant values
    }
}

