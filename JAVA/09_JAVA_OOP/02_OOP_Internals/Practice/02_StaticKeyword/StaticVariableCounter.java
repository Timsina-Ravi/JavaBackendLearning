

//Create a class Counter that uses a static variable to count how many objects are created.

public class StaticVariableCounter {
    static int count = 0; // shared among all instances

    Counter() {
        count++; // increases count on object creation
        System.out.println("Object " + count + " created");
    }

    public static void main(String[] args) {
        // Create multiple objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

