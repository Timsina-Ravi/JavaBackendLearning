

//Create an outer class with a static nested class that prints a static variable.

public class OuterWithStaticNested {
    static int data = 200; // static variable

    static class StaticNested {
        void show() {
            // Can access static members directly
            System.out.println("Static data: " + data);
        }
    }

    public static void main(String[] args) {
        // Create object of static nested class directly without outer object
        OuterWithStaticNested.StaticNested obj = new OuterWithStaticNested.StaticNested();
        obj.show();
    }
}

