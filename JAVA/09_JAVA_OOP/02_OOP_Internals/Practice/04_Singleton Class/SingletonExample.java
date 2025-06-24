

class Singleton {
    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Make constructor private to prevent outside object creation
    // This ensures no other class or code can create more than one object of Singleton.
    private Singleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: Provide public method to return the single instance
    // This method controls object creation and ensures only one instance exists.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // Lazy initialization
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        // You can't do: new Singleton();  ← Error because constructor is private
        // So, no more than one Singleton object can ever be created.

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Check if both references are the same
        System.out.println(obj1 == obj2);  // true ✅ only one object created
    }
}

