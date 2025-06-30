// Interface with a single method
interface Greeting {
    void sayHello();
}

// Implementing class
class FriendlyGreeting implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello there!");
    }
}

public class CannotInstantiateInterface {
    public static void main(String[] args) {
        // Greeting g = new Greeting(); // ❌ Compile error: interfaces cannot be instantiated

        FriendlyGreeting fg = new FriendlyGreeting(); // ✅ Use implementing class
        fg.sayHello();                                // Call method
    }
}

