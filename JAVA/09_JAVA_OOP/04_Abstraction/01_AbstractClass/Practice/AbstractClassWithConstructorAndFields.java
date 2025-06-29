// Abstract class can have fields and constructors
abstract class Shape {
    // Field common to all shapes
    String color;

    // Constructor to initialize the color field
    Shape(String color) {
        this.color = color;
    }

    // Abstract method must be implemented by subclasses
    abstract double area();
}

class Circle extends Shape {
    double radius;

    // Constructor calls superclass constructor to initialize color
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementation of abstract method area()
    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

public class AbstractClassWithConstructorAndFields {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5.0);
        System.out.println("Color: " + c.color);
        System.out.println("Area: " + c.area());
    }
}

