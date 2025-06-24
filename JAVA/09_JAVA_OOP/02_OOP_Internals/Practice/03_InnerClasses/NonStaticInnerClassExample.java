
//Create an outer class with an inner class. Use inner class to print outer class variable.

public class OuterWithInner {
    int outerData = 100; // instance variable of outer class

    class Inner {
        void display() {
            // Inner class can access outer class members
            System.out.println("Outer data is: " + outerData);
        }
    }

    public static void main(String[] args) {
        // Create outer class object first
        OuterWithInner outer = new OuterWithInner();

        // Create inner class object using outer object
        OuterWithInner.Inner inner = outer.new Inner();

        inner.display(); // Call method of inner class
    }
}

