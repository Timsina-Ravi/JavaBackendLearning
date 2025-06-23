
/**
 * Demonstrates constructor overloading.
 * Class: Rectangle
 * Constructors: default and parameterized
 * Method: calculateArea()
 */
class Rectangle {
    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        length = 10;
        breadth = 5;
    }

    // Parameterized constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class RectangleConstructorOverloading {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();         // Default values
        Rectangle r2 = new Rectangle(7, 3);     // User-defined values

        r1.calculateArea();
        r2.calculateArea();
    }
}
